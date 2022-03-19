package com.codegym.baitaplamthem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Customer() {
    }

    @OneToMany(mappedBy = "customer")
    private Set<BankBook> bankBook;

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

}
