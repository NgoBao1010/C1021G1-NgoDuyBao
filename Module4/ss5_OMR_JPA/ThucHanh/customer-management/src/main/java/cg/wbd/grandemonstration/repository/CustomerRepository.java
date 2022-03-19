package cg.wbd.grandemonstration.repository;

import cg.wbd.grandemonstration.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findOne(Long id);

    Customer save(Customer customer);

}
