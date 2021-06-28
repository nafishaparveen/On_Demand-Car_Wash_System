package com.javabrains.Customerservice.repository;

import com.javabrains.Customerservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    @Query("{'name': ?0}")
    Optional<Customer> findByName(String name);
}
