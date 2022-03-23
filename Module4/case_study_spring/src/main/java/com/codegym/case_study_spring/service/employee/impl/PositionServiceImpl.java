package com.codegym.case_study_spring.service.employee.impl;

import com.codegym.case_study_spring.model.employee.Position;
import com.codegym.case_study_spring.repository.employee.IPositionRepository;
import com.codegym.case_study_spring.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {

    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
