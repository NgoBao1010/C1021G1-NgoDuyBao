package com.codegym.case_study_spring.repository;

import com.codegym.case_study_spring.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUserName(String name);
}
