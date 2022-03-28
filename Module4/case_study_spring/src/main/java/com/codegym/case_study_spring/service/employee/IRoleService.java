package com.codegym.case_study_spring.service.employee;

import com.codegym.case_study_spring.model.security.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();
}
