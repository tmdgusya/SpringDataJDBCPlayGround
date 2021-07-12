package com.roach.springdatajdbcplaygorund.repository;

import com.roach.springdatajdbcplaygorund.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
