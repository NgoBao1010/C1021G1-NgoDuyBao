package service.interfaceCustomer;

import model.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void create(Customer customer);
    void delete(int id);
    void updateCustomer (Customer customer);
    Customer selectCustomer(int id);
}
