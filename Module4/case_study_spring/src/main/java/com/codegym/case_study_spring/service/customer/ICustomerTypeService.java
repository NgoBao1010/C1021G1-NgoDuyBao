package com.codegym.case_study_spring.service.customer;

import com.codegym.case_study_spring.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
