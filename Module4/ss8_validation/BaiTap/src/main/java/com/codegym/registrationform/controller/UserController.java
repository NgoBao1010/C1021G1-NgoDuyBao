package com.codegym.registrationform.controller;

import com.codegym.registrationform.dto.UserDto;
import com.codegym.registrationform.model.User;
import com.codegym.registrationform.repository.IUserRepository;
import com.codegym.registrationform.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/index")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("userDto",new UserDto());
        return modelAndView;
    }
    @PostMapping("/create-form")
    public String createForm(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult,
                             Model model){
        new UserDto().validate(userDto,bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "index";
        }else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            model.addAttribute("message","Create Successfully");
            userService.save(user);
            return "result";
        }
    }
}
