package com.example.publicbuddysystem.Service;

import com.example.publicbuddysystem.Model.ActiveTransit;
import com.example.publicbuddysystem.Repository.TransitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransitService {
    @Autowired
    private TransitRepository transitRepository;

    public TransitService(TransitRepository transitRepository) {
        this.transitRepository = transitRepository;
    }
    // Method to create a new active transit
    public ActiveTransit createActiveTransit(ActiveTransit activeTransit) {
        return transitRepository.save(activeTransit);
    }

    // Method to retrieve all active transits
    public List<ActiveTransit> getAllActiveTransits() {
        return transitRepository.findAll();
    }

    // Method to retrieve a specific active transit by its ID
    public Optional<ActiveTransit> getActiveTransitById(Integer activeTransitId) {
        return transitRepository.findById(activeTransitId);
    }

    // Method to delete a specific active transit by its ID
    public void deleteActiveTransit(Integer activeTransitId) {
        transitRepository.deleteById(activeTransitId);
    }
}
