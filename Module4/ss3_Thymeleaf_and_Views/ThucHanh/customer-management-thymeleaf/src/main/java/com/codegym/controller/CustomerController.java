package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import com.codegym.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.print.attribute.standard.PresentationDirection;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String index(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "index";
   }
   @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
   }
   @PostMapping("/save")
   public String save(Customer customer,RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random()*10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","Tạo mới thành công.");
        return "redirect:/customer";
   }
   @GetMapping("/{id}/edit")
   public String editForm(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "edit";
   }
   @PostMapping("/edit")
    public String editCustomer(Customer customer,RedirectAttributes redirectAttributes){
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("message","Sửa thành công");
        return "redirect:/customer";
   }

   @GetMapping("/{id}/delete")
    public String deleteForm(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "delete";
   }
   @PostMapping("/delete")
    public String deleteCustomer(Customer customer,RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/customer";
   }

   @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "view";
   }
}
