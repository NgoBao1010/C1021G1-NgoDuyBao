package com.codegym.registrationform.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

@Component
public class UserDto implements Validator {
    private int id;
    @Size(min = 5,max = 45)
    private String firstName;
    @Size(min = 5,max = 45)
    private String lastName;

    private String phoneNumber;

    private int age;
    private String mail;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String number = userDto.getPhoneNumber();
        String email = userDto.getMail();
        if("".equals(userDto.getFirstName())){
            errors.rejectValue("firstName","name.empty");
        }
        if("".equals(userDto.getLastName())){
            errors.rejectValue("lastName","name.empty");
        }
        if(number.length() < 10 || number.length() > 11){
            errors.rejectValue("phoneNumber","phone.empty");
        }
        if (!number.matches("^(0)[90|70|80|37][1-9]{7,8}$")){
            errors.rejectValue("phoneNumber","phone.matches");
        }
        if (userDto.getAge() < 18){
            errors.rejectValue("age","age.greater");
        }
        if ("".equals(userDto.getMail())){
            errors.rejectValue("mail","mail.format");
        }
        if (!email.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
            errors.rejectValue("mail","mail.matches");
        }
    }
}
