package com.codegym.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String choice(){
        return "index";
    }
    @PostMapping("/check")
    public ModelAndView checkChoice(@RequestParam(required = false) String[] condiment){
        ModelAndView modelAndView = new ModelAndView("check","list",condiment);
        return modelAndView;
    }
}
