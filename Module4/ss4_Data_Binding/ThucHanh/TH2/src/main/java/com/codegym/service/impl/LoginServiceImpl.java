package com.codegym.service.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.ILoginRepository;
import com.codegym.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    ILoginRepository loginRepository;

    @Override
    public User checkLogin(Login login) {
        return loginRepository.checkLogin(login);
    }
}
