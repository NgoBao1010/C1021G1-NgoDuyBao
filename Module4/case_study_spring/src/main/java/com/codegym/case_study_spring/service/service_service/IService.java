package com.codegym.case_study_spring.service.service_service;

import com.codegym.case_study_spring.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService {
    Page<Service> findAll(Pageable pageable);
    List<Service> findAll();
    void remove(Service service);
    void save(Service service);
    Service findByID(Long id);
}
