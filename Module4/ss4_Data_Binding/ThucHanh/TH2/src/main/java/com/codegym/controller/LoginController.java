package com.codegym.controller;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home","login",new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login")Login login){
        User user = loginService.checkLogin(login);
        ModelAndView modelAndView;
        if (user == null){
            modelAndView = new ModelAndView("error");
            return modelAndView;
        }else {
            modelAndView = new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }

}
