package com.codegym.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class FormController {
    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String showForm(){
        return "form";
    }
}
