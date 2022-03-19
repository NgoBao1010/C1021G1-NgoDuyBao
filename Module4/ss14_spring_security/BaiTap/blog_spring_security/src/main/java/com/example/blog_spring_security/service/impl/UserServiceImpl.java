package com.example.blog_spring_security.service.impl;

import com.example.blog_spring_security.model.User;
import com.example.blog_spring_security.repository.IUserRepository;
import com.example.blog_spring_security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
