package com.javabrains.Washerservice.controller;

import com.javabrains.Washerservice.model.Washer;
import com.javabrains.Washerservice.repository.WasherRepository;
import com.javabrains.Washerservice.service.WasherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/washer")
@RequiredArgsConstructor
public class WasherController {

    private final WasherService washerService;

    @PostMapping
    public ResponseEntity addWasher(@RequestBody Washer washer) {
        washerService.addWasher(washer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateWasher(@RequestBody Washer washer) {
        washerService.updateWasher(washer);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<List<Washer>> getAllWashers() {
        return ResponseEntity.ok(washerService.getAllWashers());
    }

    @GetMapping("/{name}")
    public ResponseEntity getWasherByName(@PathVariable String name) {
        return ResponseEntity.ok(washerService.getWasher(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWasher(@PathVariable String id) {
        washerService.deleteWasher(id);
        return ResponseEntity.noContent().build();
    }

}