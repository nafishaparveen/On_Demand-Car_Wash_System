package com.javabrains.Washerservice.service;

import com.javabrains.Washerservice.model.Washer;
import com.javabrains.Washerservice.repository.WasherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WasherService {

    private final WasherRepository washerRepository;

    public void addWasher(Washer washer) {
        washerRepository.insert(washer);
    }

    public void updateWasher(Washer washer) {
        Washer savedWasher = washerRepository.findById(washer.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find Washer by ID %s", washer.getId())));
        savedWasher.setName(washer.getName());
        savedWasher.setEmail(washer.getEmail());
        savedWasher.setPassword(washer.getPassword());
        savedWasher.setPhone_number(washer.getPhone_number());
        savedWasher.setWash_request(washer.getWash_request());
        savedWasher.setReviews(washer.getReviews());
        savedWasher.setRatings(washer.getRatings());

        washerRepository.save(washer);
    }

    public Washer getWasher(String name) {
        return washerRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Washer by Name - %s", name)));
    }

    public List<Washer> getAllWashers() {
        return washerRepository.findAll();

    }

    public void deleteWasher(String id) {
        washerRepository.deleteById(id);
    }
}

