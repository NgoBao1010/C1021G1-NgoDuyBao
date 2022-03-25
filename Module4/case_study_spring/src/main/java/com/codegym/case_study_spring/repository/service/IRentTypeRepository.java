package com.codegym.case_study_spring.repository.service;

import com.codegym.case_study_spring.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends JpaRepository<RentType,Long> {
}
