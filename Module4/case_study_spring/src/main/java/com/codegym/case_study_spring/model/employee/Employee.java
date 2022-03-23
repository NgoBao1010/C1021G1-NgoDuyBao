package com.codegym.case_study_spring.model.employee;

import com.codegym.case_study_spring.model.security.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    private String nameEmployee;
    private String birthday;
    private String idCardEmployee;
    private Double salary;
    private String phoneEmployee;
    private String emailEmployee;
    private String addressEmployee;


    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "idPosition")
    @JsonBackReference
    private Position position;
    @ManyToOne
    @JoinColumn(name="division_id", referencedColumnName = "idDivision")
    @JsonBackReference
    private Division division;
    @ManyToOne
    @JoinColumn(name="education_degree_id", referencedColumnName = "idEducation")
    @JsonBackReference
    private EducationDegree educationDegree;
    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

    public Employee() {
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
