package com.codegym.customvalidate.model;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class PhoneNumber implements Validator {

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumber phoneNumber = (PhoneNumber) target;
        String number = phoneNumber.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors,"phoneNumber","","Không được để trống.");
        if (number.length()>11 || number.length()<10){
            errors.rejectValue("phoneNumber","","Độ dài của số điện thoại là từ 10 đến 11 số.");
        }
        if (!number.startsWith("0")){
            errors.rejectValue("phoneNumber", "","Số điện thoại phải bắt đầu từ số 0");
        }
        if (!number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "","Chỉ được nhập số, không được nhập chữ.");
        }
    }
}
