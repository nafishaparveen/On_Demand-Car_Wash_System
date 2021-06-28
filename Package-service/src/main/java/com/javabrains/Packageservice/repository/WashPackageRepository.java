package com.javabrains.Packageservice.repository;

import com.javabrains.Packageservice.model.WashPackage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface WashPackageRepository extends MongoRepository<WashPackage, String> {
    @Query("{'name': ?0}")
    Optional<WashPackage> findByName(String name);
}
