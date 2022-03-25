package com.codegym.case_study_spring.service.service_service.impl;


import com.codegym.case_study_spring.model.service.ServiceType;
import com.codegym.case_study_spring.repository.service.IServiceTypeRepository;
import com.codegym.case_study_spring.service.service_service.IServiceType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeImpl implements IServiceType {
    @Autowired
    private IServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
