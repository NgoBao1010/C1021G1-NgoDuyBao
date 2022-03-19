package com.codegym.baitaplamthem.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import java.time.LocalDate;

public class BankBookDto implements Validator {

    private Long id;
    private LocalDate startDay;
    private String period;
    @Min(30000000)
    private long deposits;

    public BankBookDto() {
    }

    public BankBookDto(Long id, LocalDate startDay, String period, long deposits) {
        this.id = id;
        this.startDay = startDay;
        this.period = period;
        this.deposits = deposits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public long getDeposits() {
        return deposits;
    }

    public void setDeposits(long deposits) {
        this.deposits = deposits;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
