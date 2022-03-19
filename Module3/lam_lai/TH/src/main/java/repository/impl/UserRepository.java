package repository.impl;

import repository.IUserRepository;
import model.User;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    private static final String INSERT_USERS_SQL = "INSERT INTO customer (customer_name, email, country) VALUES (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users order by name; " ;
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    public BaseRepository baseRepository = new BaseRepository();
    public UserRepository() {
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    @Override
    public User selectUser(int id) {
        User user = null;
        try{
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            System.out.println(preparedStatement);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                users.add(new User(id,name,email,country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        try(Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);) {

            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void updateUser(User user) throws SQLException {
        try(Connection connection = baseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4,user.getId());

            preparedStatement.executeUpdate();
        }
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{Call get_user_by_id(?)}";
        try {
            Connection connection = baseRepository.getConnection();
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setInt(1,id);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void insertUserStore(User user) {
        String query = "{Call insert_user(?,?,?)}";
        try {
            Connection connection = baseRepository.getConnection();
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,user.getName());
            callableStatement.setString(2,user.getEmail());
            callableStatement.setString(3,user.getCountry());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> search(String country) {
        List<User> list = new ArrayList<>();
        User user = new User();
        String query = "{Call search_by_country(?)}";
        Connection connection = baseRepository.getConnection();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,"%"+country+"%");

            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setCountry(rs.getString("country"));
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                String country1 = rs.getString("country");
//                user = new User(id,name,email,country1);
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}

