package com.codegym.shopping.controller;

import com.codegym.shopping.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
    @ModelAttribute("cart")
    public CartDto setupCart(){
        return new CartDto();
    }

    @GetMapping("/shopping-cart")
    public ModelAndView showCart(@SessionAttribute(value = "cart",required = false) CartDto cartDto){
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("cart",cartDto);
        return modelAndView;
    }
}
