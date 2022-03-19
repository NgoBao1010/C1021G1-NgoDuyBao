package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public ModelAndView createForm(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.insertWithStoredProcedure(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("message","Add New Customer Successfully");
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView showList(){
        List<Customer> customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customerList",customerList);
        return modelAndView;
    }
}
