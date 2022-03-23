package com.codegym.case_study_spring.model.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    private String nameCustomer;
    private String birthday;
    private boolean gender;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;

    @ManyToOne
    @JoinColumn(name = "customerType_id",referencedColumnName = "idCustomerType")
    @JsonBackReference
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(Long idCustomer, String nameCustomer, String birthday, boolean gender, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, CustomerType customerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.customerType = customerType;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long id) {
        this.idCustomer = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }


    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
