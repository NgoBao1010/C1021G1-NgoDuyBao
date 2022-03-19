package com.codegym.th1.repository;

import com.codegym.th1.model.Customer;
import com.codegym.th1.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ICustomerRepo extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
