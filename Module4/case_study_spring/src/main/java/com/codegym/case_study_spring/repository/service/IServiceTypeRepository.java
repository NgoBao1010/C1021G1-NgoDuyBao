package com.codegym.case_study_spring.repository.service;

import com.codegym.case_study_spring.model.service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends JpaRepository<ServiceType,Long> {
}
