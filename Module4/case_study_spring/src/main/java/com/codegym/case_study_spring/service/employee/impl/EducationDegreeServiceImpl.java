package com.codegym.case_study_spring.service.employee.impl;

import com.codegym.case_study_spring.model.employee.EducationDegree;
import com.codegym.case_study_spring.repository.employee.IEducationDegreeRepository;
import com.codegym.case_study_spring.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
