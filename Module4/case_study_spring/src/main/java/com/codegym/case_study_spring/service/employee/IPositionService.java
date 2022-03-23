package com.codegym.case_study_spring.service.employee;

import com.codegym.case_study_spring.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
