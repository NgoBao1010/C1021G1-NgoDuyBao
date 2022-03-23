package com.codegym.case_study_spring.service.employee;

import com.codegym.case_study_spring.model.employee.EducationDegree;


import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();
}
