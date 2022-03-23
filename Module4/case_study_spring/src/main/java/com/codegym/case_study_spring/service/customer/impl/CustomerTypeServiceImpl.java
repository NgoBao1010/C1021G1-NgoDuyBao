package com.codegym.case_study_spring.service.customer.impl;

import com.codegym.case_study_spring.model.customer.CustomerType;
import com.codegym.case_study_spring.repository.customer.ICustomerTypeRepository;
import com.codegym.case_study_spring.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
