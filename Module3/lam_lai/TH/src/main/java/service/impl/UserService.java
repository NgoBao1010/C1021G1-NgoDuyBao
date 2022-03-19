package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    IUserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        User user = this.userRepository.selectUser(id);
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = this.userRepository.selectAllUsers();
        return users;
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        this.userRepository.deleteUser(id);
    }

    @Override
    public void updateUser(User user) throws SQLException {
        this.userRepository.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        User user = this.userRepository.getUserById(id);
        return user;
    }

    @Override
    public List<User> search(String country)throws SQLException{
        List<User> list = this.userRepository.search(country);
        return list;
    }
}
