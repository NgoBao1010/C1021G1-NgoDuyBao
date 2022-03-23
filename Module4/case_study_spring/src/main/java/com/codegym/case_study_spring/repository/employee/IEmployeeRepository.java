package com.codegym.case_study_spring.repository.employee;

import com.codegym.case_study_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    Page<Employee> findByNameEmployee(String name, Pageable pageable);
}
