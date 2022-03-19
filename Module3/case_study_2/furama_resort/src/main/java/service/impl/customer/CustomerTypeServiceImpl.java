package service.impl.customer;

import model.customer.CustomerType;
import repository.interfaceCustomer.CustomerTypeRepository;
import repository.impl.customer.CustomerTypeRepositoryImpl;
import service.interfaceCustomer.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
