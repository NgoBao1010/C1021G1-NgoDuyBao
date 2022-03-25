package com.codegym.case_study_spring.service.service_service.impl;

import com.codegym.case_study_spring.model.service.RentType;
import com.codegym.case_study_spring.repository.service.IRentTypeRepository;
import com.codegym.case_study_spring.service.service_service.IRentType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeImpl implements IRentType {
    @Autowired
    private IRentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
