package com.codegym.th2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/list")
    public String showIndex() {
        return "phones/list";
    }
}
