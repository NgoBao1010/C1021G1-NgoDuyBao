package repository.impl.customer;

import model.customer.Customer;
import repository.interfaceCustomer.CustomerRepository;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_name, customer_birthday, customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) VALUES (?,?,?,?,?,?, ?, ?);";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from customer where customer_id =?";
    private static String SELECT_ALL_CUSTOMER = "SELECT * FROM customer \n" +
            "join customer_type on customer.customer_type_id = customer_type.customer_type_id;";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id = ?";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set customer_name = ?,customer_birthday= ?, customer_gender =?, customer_id_card =?, customer_phone =?, customer_email =?, customer_address =?,customer_type_id=? where customer_id = ?;";

    public DBConnection dbConnection = new DBConnection();
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try{

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                boolean gender = resultSet.getBoolean("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int idCustomerType = resultSet.getInt("customer_type_id");
                String nameCustomerType = resultSet.getString("customer_type_name");
                customers.add(new Customer(id,name,birthday,gender,idCard,phone,email,address,idCustomerType,nameCustomerType));
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
        return customers;
    }

    @Override
    public void create(Customer customer) {
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement =null;
        if (connection != null){
            try {
                preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
                preparedStatement.setString(1,customer.getNameCustomer());
                preparedStatement.setString(2,customer.getBirthday());
                preparedStatement.setBoolean(3,customer.isGender());
                preparedStatement.setString(4,customer.getIdCardCustomer());
                preparedStatement.setString(5,customer.getPhoneCustomer());
                preparedStatement.setString(6,customer.getEmailCustomer());
                preparedStatement.setString(7,customer.getAddressCustomer());
                preparedStatement.setInt(8,customer.getIdCustomerType());

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
                preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
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
    public void updateCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            preparedStatement.setString(1, customer.getNameCustomer());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setBoolean(3, customer.isGender());
            preparedStatement.setString(4,customer.getIdCardCustomer());
            preparedStatement.setString(5, customer.getPhoneCustomer());
            preparedStatement.setString(6, customer.getEmailCustomer());
            preparedStatement.setString(7, customer.getAddressCustomer());
            preparedStatement.setInt(8,customer.getIdCustomerType());
            preparedStatement.setInt(9,customer.getIdCustomer());

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
    public Customer selectCustomer(int id) {
        Customer customer = null;
        Connection connection = DBConnection.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int customerID = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                boolean gender = resultSet.getBoolean("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int idCustomerType = resultSet.getInt("customer_type_id");
                customer = new Customer(customerID,name,birthday,gender,idCard,phone,email,address,idCustomerType);
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
        return customer;
    }
}
