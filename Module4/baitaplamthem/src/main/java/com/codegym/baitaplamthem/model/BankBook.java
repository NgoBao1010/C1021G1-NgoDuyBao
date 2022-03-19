package com.codegym.baitaplamthem.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BankBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDay;
    private String period;
    private long deposits;

    public BankBook() {
    }

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

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
}
