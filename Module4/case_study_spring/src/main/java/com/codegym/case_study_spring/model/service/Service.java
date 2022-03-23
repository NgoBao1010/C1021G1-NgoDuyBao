package com.codegym.case_study_spring.model.service;

import com.codegym.case_study_spring.model.employee.Division;
import com.codegym.case_study_spring.model.employee.Position;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idService;
    private String nameService;
    private int areaService;
    private double costService;
    private int maxPeople;
    private String roomStandard;
    private String description;
    private double poolArea;
    private int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "idRentType")
    @JsonBackReference
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name="service_type_id", referencedColumnName = "idServiceType")
    @JsonBackReference
    private ServiceType serviceType;

    public Service() {
    }


    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaService() {
        return areaService;
    }

    public void setAreaService(int areaService) {
        this.areaService = areaService;
    }

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
        this.costService = costService;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
