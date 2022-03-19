package com.example.blog_spring_security.service;

import com.example.blog_spring_security.model.User;

import java.util.List;

public interface IUserService {
    User findById(int id);
    List<User> findAll();
}
