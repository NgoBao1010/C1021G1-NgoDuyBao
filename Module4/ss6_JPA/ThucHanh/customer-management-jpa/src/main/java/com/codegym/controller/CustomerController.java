package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
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
        customerService.save(customer);
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

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("message","Customer update successfully");
        return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer,RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("delete","Delete Customer Successfully");
        return "redirect:customers";
    }
}
