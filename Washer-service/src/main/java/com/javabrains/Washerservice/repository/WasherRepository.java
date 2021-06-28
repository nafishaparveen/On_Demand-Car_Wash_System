package com.javabrains.Washerservice.repository;

import com.javabrains.Washerservice.model.Washer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WasherRepository extends MongoRepository<Washer, String> {

    @Query("{'name': ?0}")
    Optional<Washer> findByName(String name);
}
