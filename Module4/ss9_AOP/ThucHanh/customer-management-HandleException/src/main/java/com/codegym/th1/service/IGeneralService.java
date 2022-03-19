package com.codegym.th1.service;

import com.codegym.th1.service.exception.DuplicateEmailException;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t) throws DuplicateEmailException;

    void remove(Long id);
}
