package com.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.codegym.service.IDictionaryService;


@Controller
public class DictionaryController {

    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("home")
    public String home(){
        return "home";
    }
    @PostMapping("home")
    public String result(@RequestParam String input, Model model){
        String result = dictionaryService.check(input);
        model.addAttribute("result",result);
        return "home";
    }
}
