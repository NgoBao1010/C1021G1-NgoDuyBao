package com.codegym.case_study_spring.repository.employee;

import com.codegym.case_study_spring.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {

}
