package com.codegym.case_study_spring.controller;

import com.codegym.case_study_spring.model.customer.Customer;
import com.codegym.case_study_spring.service.customer.ICustomerService;
import com.codegym.case_study_spring.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping
    private ModelAndView showList(@PageableDefault(value = 3)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customerList",customerService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView searchCustomer(@RequestParam(defaultValue = "nameSearch") Optional<String> nameSearch, @PageableDefault(value = 3)
            Pageable pageable) {
        Page<Customer> customerPage;
        if (nameSearch.isPresent()){
            customerPage = customerService.findByNameCustomerContaining(nameSearch.get(), pageable);
        }else {
            customerPage = customerService.findAll(pageable);
        }
        return new ModelAndView("customer/list", "customerList", customerPage);
    }
    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("customerTypeList",customerTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Thêm mới thành công");
        return ("redirect:/customer");
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customerTypeList",customerTypeService.findAll());
            modelAndView.addObject("customers", customer);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error-404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute Customer customer){
        customerService.save(customer);
        return ("redirect:/customer");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id , RedirectAttributes redirectAttributes){
        customerService.deleteById(id);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/customer";
    }

}

