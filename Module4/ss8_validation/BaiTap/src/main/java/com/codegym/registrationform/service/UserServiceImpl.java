package com.codegym.registrationform.service;

import com.codegym.registrationform.model.User;
import com.codegym.registrationform.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
