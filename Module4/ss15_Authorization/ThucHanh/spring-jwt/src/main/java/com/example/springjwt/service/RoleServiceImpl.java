package com.example.springjwt.service;

import com.example.springjwt.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleService roleService;

    @Override
    public Iterable<Role> findAll() {
        return roleService.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleService.findById(id);
    }

    @Override
    public Role save(Role role) {
        return roleService.save(role);
    }

    @Override
    public void remove(Long id) {
        roleService.remove(id);
    }

    @Override
    public Role findByName(String name) {
        return roleService.findByName(name);
    }
}
