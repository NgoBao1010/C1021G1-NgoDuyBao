package repository.impl;

import model.Product;
import repository.DBConnection;
import repository.ProductRepo;
import service.impl.ProductServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements ProductRepo {
    private static String SELECT_ALL_PRODUCT = "SELECT * FROM product \n" +
            "join category on product.category_id = category.category_id;";
    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product (product_name, price, quantity,color,category_id) VALUES (?,?,?,?,?);";
    private static final String SELECT_PRODUCT_BY_ID = "select * from product where product_id =?";
    private static final String UPDATE_PRODUCT_SQL = "update product set product_name = ?,price= ?, quantity =?, color =?, category_id =? where product_id = ?;";
    private static final String DELETE_PRODUCT_SQL = "delete from product where product_id = ?";


    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int idCategory = resultSet.getInt("category_id");
                String nameCategory = resultSet.getString("category_name");

                productList.add(new Product(id,name,price,quantity,color,idCategory,nameCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    @Override
    public void create(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement =null;
        if (connection != null){
            try {
                preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
                preparedStatement.setString(1,product.getNameProduct());
                preparedStatement.setDouble(2,product.getPrice());
                preparedStatement.setInt(3,product.getQuantity());
                preparedStatement.setString(4,product.getColor());
                preparedStatement.setInt(5,product.getIdCategory());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_PRODUCT_SQL);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void updateProduct(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_SQL);
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setInt(5, product.getIdCategory());
            preparedStatement.setInt(6, product.getIdProduct());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Product selectProduct(int id) {
        Product product = null;
        Connection connection = DBConnection.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idProduct = resultSet.getInt("product_id");
                String name = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int idCategory = resultSet.getInt("category_id");
                product = new Product(idProduct,name,price,quantity,color,idCategory);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return product;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        String query = "{Call search_name(?)}";
        Connection connection = DBConnection.getConnection();

        try {
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = callableStatement.executeQuery();
            Product product = new Product();
            while (resultSet.next()){
                product.setIdProduct(resultSet.getInt("product_id"));
                product.setNameProduct(resultSet.getString("product_name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setColor(resultSet.getString("color"));
                product.setIdCategory(resultSet.getInt("category_id"));
                productList.add(product);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
