package com.example.publicbuddysystem.Service;

import com.example.publicbuddysystem.Model.Bus;
import com.example.publicbuddysystem.Repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) { this.busRepository = busRepository; }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public List<Bus> getSpecificBus(int busNumber) {
        List<Bus> buses = this.getAllBuses();
        List<Bus> specificBuses = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.getBusNumber() == busNumber) {
                specificBuses.add(bus);
            }
        }
        return specificBuses;
    }
}
