package com.example.blog_spring_security.repository;

import com.example.blog_spring_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);
}
