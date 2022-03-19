package com.codegym.th1.service;

import com.codegym.th1.model.Customer;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    Customer findById(Long id);
    T save(T t);
    void remove(Long id);
}
