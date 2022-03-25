package com.codegym.case_study_spring.service.employee.impl;

import com.codegym.case_study_spring.model.security.User;
import com.codegym.case_study_spring.repository.IUserRepository;
import com.codegym.case_study_spring.service.employee.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
