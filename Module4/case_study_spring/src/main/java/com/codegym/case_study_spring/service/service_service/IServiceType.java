package com.codegym.case_study_spring.service.service_service;


import com.codegym.case_study_spring.model.service.ServiceType;

import java.util.List;

public interface IServiceType {
    List<ServiceType> findAll();
}
