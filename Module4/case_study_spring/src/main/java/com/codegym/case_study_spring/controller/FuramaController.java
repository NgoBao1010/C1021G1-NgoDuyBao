package com.codegym.case_study_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FuramaController {

    @GetMapping("/homepage")
    public String homepage(){
        return "home";
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "login";
    }
}
