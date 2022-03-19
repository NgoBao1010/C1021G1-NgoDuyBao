package com.codegym.controller;

import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @GetMapping(value = "/")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "employee/create";
    }
    @PostMapping("/add")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap modelMap){
        modelMap.addAttribute("name",employee.getName());
        modelMap.addAttribute("contactNumber",employee.getContactNumber());
        modelMap.addAttribute("id",employee.getId());
        return "employee/info";
    }
}
