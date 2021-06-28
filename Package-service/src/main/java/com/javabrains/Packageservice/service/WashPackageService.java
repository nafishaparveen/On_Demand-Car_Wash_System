package com.javabrains.Packageservice.service;

import com.javabrains.Packageservice.model.WashPackage;
import com.javabrains.Packageservice.repository.WashPackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WashPackageService {

    private final WashPackageRepository washpackageRepository;

    public void addWashPackage(WashPackage washpackage) {
        washpackageRepository.insert(washpackage);
    }

    public void updateWashPackage(WashPackage washpackage) {
        WashPackage savedWashPackage = washpackageRepository.findById(washpackage.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find WashPackage by ID %s", washpackage.getId())));
        savedWashPackage.setName(washpackage.getName());
        savedWashPackage.setType(washpackage.getType());
        savedWashPackage.setPrice(washpackage.getPrice());
        savedWashPackage.setService(washpackage.getService());

        washpackageRepository.save(washpackage);
    }

    public WashPackage getWashPackage(String name) {
        return washpackageRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find WashPackage by Name - %s", name)));
    }

    public List<WashPackage> getAllWashPackages() {
        return washpackageRepository.findAll();
    }

    public void deleteWashPackage(String id) {
        washpackageRepository.deleteById(id);
    }





}
