package com.codegym.case_study_spring.service.employee.impl;

import com.codegym.case_study_spring.model.security.Role;
import com.codegym.case_study_spring.repository.employee.IRoleRepository;
import com.codegym.case_study_spring.service.employee.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
