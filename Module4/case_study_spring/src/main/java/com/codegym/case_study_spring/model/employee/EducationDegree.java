package com.codegym.case_study_spring.model.employee;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEducation;
    private String nameEducation;

    @OneToMany(mappedBy = "educationDegree",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employee;

    public EducationDegree() {
    }

    public Long getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Long idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}
