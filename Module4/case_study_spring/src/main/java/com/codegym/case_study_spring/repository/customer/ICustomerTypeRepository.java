package com.codegym.case_study_spring.repository.customer;

import com.codegym.case_study_spring.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
