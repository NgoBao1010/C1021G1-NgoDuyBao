package com.example.springjwt.service;

import com.example.springjwt.model.Role;
import com.example.springjwt.repository.IRoleRepository;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
