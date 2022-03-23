package com.codegym.case_study_spring.controller;

import com.codegym.case_study_spring.model.employee.Employee;
import com.codegym.case_study_spring.service.employee.IDivisionService;
import com.codegym.case_study_spring.service.employee.IEducationDegreeService;
import com.codegym.case_study_spring.service.employee.IEmployeeService;
import com.codegym.case_study_spring.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IPositionService positionService;

    @GetMapping
    private ModelAndView showList(@PageableDefault(value = 3)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employeeList",employeeService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView showListEmployee(@RequestParam(defaultValue = "") String name, @PageableDefault(value = 5)
            Pageable pageable) {

        Page<Employee> employeePage;
        if (name != null) {
            employeePage = employeeService.findByNameEmployee(name, pageable);
        } else {
            employeePage = employeeService.findAll(pageable);
        }

        return new ModelAndView("employee/list", "employees", employeePage);
    }

    @GetMapping("/create-employee")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("divisionList", divisionService.findAll());
        modelAndView.addObject("educationList", educationDegreeService.findAll());
        modelAndView.addObject("positionList", positionService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public String saveEmployee(Employee employee, RedirectAttributes redirectAttributes) {

        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Thêm mới thành công");
        return ("redirect:/employee");
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("divisionList", divisionService.findAll());
            modelAndView.addObject("educationList", educationDegreeService.findAll());
            modelAndView.addObject("positionList", positionService.findAll());
            modelAndView.addObject("employees", employee);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error-404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-employee")
    public String updateEmployee(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return ("redirect:/employee");
    }
    @GetMapping("/delete-employee")
    public String delete(@RequestParam Long id , RedirectAttributes redirectAttributes){
        Employee employee= employeeService.findById(id);
        employeeService. remove(employee);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/employee";
    }
}
