package com.javabrains.Packageservice.controller;


import com.javabrains.Packageservice.model.WashPackage;
import com.javabrains.Packageservice.service.WashPackageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/WashPackage")
@RequiredArgsConstructor
public class WashPackageController {
    private final WashPackageService washpackageService;

    @PostMapping
    public ResponseEntity addWashPackage(@RequestBody WashPackage washpackage) {
        washpackageService.addWashPackage(washpackage);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateWashPackage(@RequestBody WashPackage washpackage) {
        washpackageService.updateWashPackage(washpackage);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<List<WashPackage>> getAllWashPackages() {
        return ResponseEntity.ok(washpackageService.getAllWashPackages());
    }

    @GetMapping("/{name}")
    public ResponseEntity getWashPackageByName(@PathVariable String name) {
        return ResponseEntity.ok(washpackageService.getWashPackage(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWashPackage(@PathVariable String id) {
        washpackageService.deleteWashPackage(id);
        return ResponseEntity.noContent().build();
    }



}
