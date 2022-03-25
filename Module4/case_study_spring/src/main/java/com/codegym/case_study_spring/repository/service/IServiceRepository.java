package com.codegym.case_study_spring.repository.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codegym.case_study_spring.model.service.Service;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<Service,Long> {
}
