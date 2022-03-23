package com.codegym.case_study_spring.model.service;

import com.codegym.case_study_spring.model.employee.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRentType;
    private String nameRentType;
    private double costRentType;

    @OneToMany(mappedBy = "rentType",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Service> service;

    public RentType() {
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public double getCostRentType() {
        return costRentType;
    }

    public void setCostRentType(double costRentType) {
        this.costRentType = costRentType;
    }

    public Set<Service> getService() {
        return service;
    }

    public void setService(Set<Service> service) {
        this.service = service;
    }
}
