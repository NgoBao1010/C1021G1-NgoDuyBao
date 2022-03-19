package com.codegym.shopping.controller;

import com.codegym.shopping.dto.CartDto;
import com.codegym.shopping.model.Product;
import com.codegym.shopping.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@SessionAttributes("cart")
public class ProductController {
    @Qualifier("productServiceImpl")
    @Autowired
    private IProductService productService;
    @ModelAttribute("cart")
    public CartDto setupCart(){
        return new CartDto();
    }

    @GetMapping("/shop")
    public ModelAndView showShop(){
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id,@ModelAttribute CartDto cartDto,
                            @RequestParam("action") String action){
        Optional<Product> productDtoOptional = productService.findById(id);
        if (!productDtoOptional.isPresent()) {
            return "error404";
        }
        if (action.equals("+")) {
            cartDto.addProduct(productDtoOptional.get());
            return "redirect:/shopping-cart";
        } else if (action.equals("-")) {
            cartDto.remove(productDtoOptional.get());
            return "redirect:/shopping-cart";
        }
        cartDto.addProduct(productDtoOptional.get());
        return "redirect:/shop";
    }
}
