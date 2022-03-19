package repository.impl;

import model.Category;
import model.Product;
import repository.CategoryRepo;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepoImpl implements CategoryRepo {
    private static String SELECT_ALL_CATEGORY = "SELECT * FROM category;";
    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idCategory = resultSet.getInt("category_id");
                String nameCategory = resultSet.getString("category_name");

                categoryList.add(new Category(idCategory,nameCategory));
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
        return categoryList;
    }
}
