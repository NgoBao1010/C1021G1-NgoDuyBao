package com.codegym.registrationform.repository;

import com.codegym.registrationform.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User,Integer> {
}
