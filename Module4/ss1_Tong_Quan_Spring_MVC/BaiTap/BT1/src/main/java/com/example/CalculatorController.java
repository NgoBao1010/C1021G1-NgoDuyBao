package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String calculator(){
        return "home";
    }
    @PostMapping("/")
    public String calculator(@RequestParam double usd, double rate, Model model){
        double vnd = usd * rate;
        model.addAttribute("vnd",vnd);
        return "home";
    }
}
