package com.codegym.th1.service.impl;

import com.codegym.th1.model.Customer;
import com.codegym.th1.model.Province;
import com.codegym.th1.repository.ICustomerRepo;
import com.codegym.th1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepo customerRepo;


    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepo.findAllByProvince(province);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepo.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepo.deleteById(id);
    }
}
