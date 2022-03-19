package com.codegym.shopping.repository;

import com.codegym.shopping.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
}
