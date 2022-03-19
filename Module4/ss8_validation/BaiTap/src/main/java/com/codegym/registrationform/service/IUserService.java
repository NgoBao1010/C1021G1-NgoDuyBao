package com.codegym.registrationform.service;

import com.codegym.registrationform.model.User;
import org.springframework.stereotype.Service;


public interface IUserService {
    void save (User user);
}
