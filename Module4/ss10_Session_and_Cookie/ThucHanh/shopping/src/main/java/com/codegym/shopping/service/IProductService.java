package com.codegym.shopping.service;

import com.codegym.shopping.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
