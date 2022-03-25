package com.codegym.case_study_spring.controller;

import com.codegym.case_study_spring.model.service.Service;
import com.codegym.case_study_spring.service.service_service.IRentType;
import com.codegym.case_study_spring.service.service_service.IService;
import com.codegym.case_study_spring.service.service_service.IServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private IService iService;
    @Autowired
    private IServiceType iServiceType;
    @Autowired
    private IRentType iRentType;

    @GetMapping
    public ModelAndView showList(@PageableDefault(value = 3) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("service/list");
        modelAndView.addObject("serviceList",iService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/create-service")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("services",new Service());
        modelAndView.addObject("serviceTypeList",iServiceType.findAll());
        modelAndView.addObject("rentTypeList",iRentType.findAll());

        return modelAndView;
    }

    @PostMapping("/create-service")
    public String saveService(@ModelAttribute("service") Service service, RedirectAttributes redirectAttributes){
        iService.save(service);
        redirectAttributes.addFlashAttribute("message", "Thêm mới thành công");
        return ("redirect:/service");
    }
    @GetMapping("/edit-service/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Service service = iService.findByID(id);
        if (service != null) {
            ModelAndView modelAndView = new ModelAndView("/service/edit");
            modelAndView.addObject("services", service);
            modelAndView.addObject("serviceTypeList",iServiceType.findAll());
            modelAndView.addObject("rentTypeList",iRentType.findAll());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error-404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-service")
    public String updateService(@ModelAttribute Service service){
        iService.save(service);
        return ("redirect:/service");
    }
    @GetMapping("/delete/{id}")
    public String delete(@RequestParam Long id , RedirectAttributes redirectAttributes){
        Service service= iService.findByID(id);
        iService.remove(service);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/service";
    }

}
