package com.codegym.case_study_spring.service.customer;

import com.codegym.case_study_spring.model.customer.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void deleteById(Long id);
    void remove(Customer customer);
    Page<Customer> findByNameCustomerContaining(String name, Pageable pageable);
}
