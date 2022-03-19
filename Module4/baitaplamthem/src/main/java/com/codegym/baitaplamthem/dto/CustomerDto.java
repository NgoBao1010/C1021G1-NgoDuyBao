package com.codegym.baitaplamthem.dto;

import com.codegym.baitaplamthem.model.BankBook;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.NumberUtils;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.text.NumberFormat;
import java.util.Set;


public class CustomerDto implements Validator {
    private Long id;

    @Pattern(regexp = "^[A-Za-z]$")
    private String name;

    public CustomerDto() {
    }

    public CustomerDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
        if(customerDto.getName() == )
    }
}
