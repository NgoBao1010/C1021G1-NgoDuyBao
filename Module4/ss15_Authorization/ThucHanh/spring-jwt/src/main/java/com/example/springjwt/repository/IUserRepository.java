package com.example.springjwt.repository;

import com.example.springjwt.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByUsername(String username);
}