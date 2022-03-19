package dao;



import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    User getUserById(int id);

    void insertUserStore(User user);

    List<User> search(String country)throws SQLException;

    void addUserTransaction(User user,int[] permision);
}

