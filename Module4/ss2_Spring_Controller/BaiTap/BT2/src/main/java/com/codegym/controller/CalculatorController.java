package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import com.codegym.service.impl.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @PostMapping("/calculator")
    public String calculator(@RequestParam int value1, int value2,String calculation, Model model){
        int result = calculatorService.calculator(value1,value2,calculation);
        model.addAttribute("result",result);
        return "index";
    }

}
