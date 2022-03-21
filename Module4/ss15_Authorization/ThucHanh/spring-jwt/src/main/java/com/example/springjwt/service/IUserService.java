package com.example.springjwt.service;

import com.example.springjwt.model.Users;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<Users>, UserDetailsService {
    Optional<Users> findByUsername(String username);
}
