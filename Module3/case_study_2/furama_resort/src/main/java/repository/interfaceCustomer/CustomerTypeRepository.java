package repository.interfaceCustomer;

import model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> findAll();
}
