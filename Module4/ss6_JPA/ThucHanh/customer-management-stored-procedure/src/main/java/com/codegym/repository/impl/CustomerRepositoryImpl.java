package com.codegym.repository.impl;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class CustomerRepositoryImpl implements ICustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        String queryStr = "call insert_customer(:firstName,:lastName)";
        Query query = entityManager.createNativeQuery(queryStr);
        query.setParameter("firstName",customer.getFirstName());
        query.setParameter("lastName",customer.getLastName());
        return query.executeUpdate() == 0;
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }
}
