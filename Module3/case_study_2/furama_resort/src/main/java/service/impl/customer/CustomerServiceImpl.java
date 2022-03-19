package service.impl.customer;

import model.customer.Customer;
import repository.interfaceCustomer.CustomerRepository;
import repository.impl.customer.CustomerRepositoryImpl;
import service.interfaceCustomer.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void create(Customer customer) {
        customerRepository.create(customer);
    }

    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }
}
