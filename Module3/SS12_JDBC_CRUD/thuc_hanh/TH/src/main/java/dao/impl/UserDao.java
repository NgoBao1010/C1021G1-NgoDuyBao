package dao.impl;

import dao.IUserDao;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo_thuchanh";
    private String jdbcUsername = "root";
    private String jdbcPassword = "abdclsmmt1010";

    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users order by name; " ;
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    public UserDao() {
    }

    protected Connection getConnection(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try{
            Connection connection = getConnection();
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
            Connection connection = getConnection();
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
            Connection connection = getConnection();
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
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);) {

            preparedStatement.setInt(1,id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4,user.getId());

            rowUpdated = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{Call get_user_by_id(?)}";
        try {
            Connection connection = getConnection();
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
            Connection connection = getConnection();
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
        List<User> userList = new ArrayList<>();
        List<User> list = this.selectAllUsers();
        for (User user: list){
            if (user.getCountry().toLowerCase().contains(country.toLowerCase())){
                userList.add(user);
            }
        }
        return userList ;
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        Connection connection = connection = getConnection();
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultSet = null;
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(INSERT_USERS_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            int rowAff = preparedStatement.executeUpdate();

            resultSet = preparedStatement.getGeneratedKeys();
            int userId = 0;
            if (resultSet.next()){
                userId = resultSet.getInt(1);
            }
            if (rowAff == 1){
                String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) " + "VALUES(?,?)";

                preparedStatement1 = connection.prepareStatement(sqlPivot);
                for (int permisionId : permision){
                    preparedStatement1.setInt(1,userId);
                    preparedStatement1.setInt(2,permisionId);
                    preparedStatement1.executeUpdate();
                }
                connection.commit();
            }else {
                connection.rollback();
            }
        } catch (SQLException ex) {
            try {
                if (connection != null){
                    connection.rollback();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (resultSet != null){
                    resultSet.close();
                }
                if (preparedStatement != null){
                    preparedStatement.close();
                }
                if (preparedStatement1 != null){
                    preparedStatement1.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

