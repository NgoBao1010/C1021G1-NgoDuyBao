package com.codegym.case_study_spring.service.employee;

import com.codegym.case_study_spring.model.security.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Long id);
}
