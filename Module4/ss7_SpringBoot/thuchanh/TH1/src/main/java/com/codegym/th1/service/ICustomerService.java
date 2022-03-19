package com.codegym.th1.service;

import com.codegym.th1.model.Customer;
import com.codegym.th1.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
