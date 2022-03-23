package com.codegym.case_study_spring.repository.employee;

import com.codegym.case_study_spring.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position,Long> {
}
