package com.codegym.th1.service;

import com.codegym.th1.model.Customer;

import com.codegym.th1.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
