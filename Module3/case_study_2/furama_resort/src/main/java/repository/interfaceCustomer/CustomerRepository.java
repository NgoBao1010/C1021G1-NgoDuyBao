package repository.interfaceCustomer;

import model.customer.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    void create(Customer customer);
    void delete(int id);
    void updateCustomer (Customer customer);
    Customer selectCustomer(int id);
}
