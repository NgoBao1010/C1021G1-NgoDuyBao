package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "create";
    }
    @PostMapping("/save")
    public String createProduct(Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message","Create Success!!!");
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String editForm (@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String editProduct (Product product,RedirectAttributes redirectAttributes){
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("message","Product Information Update Success!!!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String deleteForm(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteProduct(Product product,RedirectAttributes redirectAttributes){
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("messsage","Delete Product Success!!!");
        return "redirect:/product";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }

    @PostMapping("/search")
    public String searchByName(@RequestParam String nameProduct,Model model){
        model.addAttribute("productList",productService.searchByName(nameProduct));
        return "list";
    }
}
