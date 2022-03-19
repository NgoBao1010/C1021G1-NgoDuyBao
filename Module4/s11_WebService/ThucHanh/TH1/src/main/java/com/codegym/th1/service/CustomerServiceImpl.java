package com.codegym.th1.service;

import com.codegym.th1.model.Customer;
import com.codegym.th1.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}
