package com.codegym.case_study_spring.service.employee.impl;

import com.codegym.case_study_spring.model.employee.Division;
import com.codegym.case_study_spring.repository.employee.IDivisionRepository;
import com.codegym.case_study_spring.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
