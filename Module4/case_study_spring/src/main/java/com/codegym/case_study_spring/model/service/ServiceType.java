package com.codegym.case_study_spring.model.service;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceType;
    private String nameServiceType;

    @OneToMany(mappedBy = "serviceType",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Service> service;

    public ServiceType() {
    }

    public Long getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(Long idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }

    public Set<Service> getService() {
        return service;
    }

    public void setService(Set<Service> service) {
        this.service = service;
    }
}
