package com.codegym.service;

import com.codegym.model.Login;
import com.codegym.model.User;

public interface ILoginService {
    User checkLogin(Login login);
}
