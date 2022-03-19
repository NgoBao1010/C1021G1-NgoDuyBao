package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    void deleteUser(int id) throws SQLException;

    void updateUser(User user) throws SQLException;

    User getUserById(int id);
    List<User> search(String country) throws SQLException;
}
