package com.codegym.case_study_spring.service.employee;

import com.codegym.case_study_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);
    void save(Employee employee);
    void deleteById(Long id);
    void remove(Employee employee);
    Page<Employee> findByNameEmployee(String name, Pageable pageable);
}