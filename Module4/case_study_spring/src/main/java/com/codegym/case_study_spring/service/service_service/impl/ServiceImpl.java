package com.codegym.case_study_spring.service.service_service.impl;

import com.codegym.case_study_spring.repository.service.IServiceRepository;
import com.codegym.case_study_spring.service.service_service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.codegym.case_study_spring.model.service.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements IService {

    @Autowired
    private IServiceRepository iServiceRepository;
    @Override
    public Page<Service> findAll(Pageable pageable) {
        return iServiceRepository.findAll(pageable);
    }

    @Override
    public List<Service> findAll() {
        return iServiceRepository.findAll();
    }

    @Override
    public void remove(Service service) {
        iServiceRepository.delete(service);
    }

    @Override
    public void save(Service service) {
        iServiceRepository.save(service);
    }

    @Override
    public Service findByID(Long id) {
        return iServiceRepository.findById(id).orElse(null);
    }
}
