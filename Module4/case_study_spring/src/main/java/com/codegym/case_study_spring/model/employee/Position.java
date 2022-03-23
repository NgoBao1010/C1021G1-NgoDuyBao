package com.codegym.case_study_spring.model.employee;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;
    private String namePosition;

    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employee;

    public Position() {
    }

    public Long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
