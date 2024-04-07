package com.example.publicbuddysystem.Controller;

import com.example.publicbuddysystem.Model.Bus;
import com.example.publicbuddysystem.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
@CrossOrigin
public class BusController {

    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    // Endpoint to retrieve all buses
    @GetMapping("/buses")
    public ResponseEntity<List<Bus>> getAllBuses() {
        List<Bus> buses = busService.getAllBuses();
        return ResponseEntity.ok(buses);
    }

    // Endpoint to retrieve a specific bus by its busNumber
    @GetMapping("/{busNumber}")
    public ResponseEntity<List<Bus>> getSpecificBus(@PathVariable Integer busNumber) {
        List<Bus> bus = busService.getSpecificBus(busNumber);

        return ResponseEntity.ok(bus);

    }

    @GetMapping("/{busNumber}/{stops}")
    public ResponseEntity<Bus> getSpecificBus(@PathVariable Integer busNumber, @PathVariable String stops) {
        return ResponseEntity.ok(busService.getBusByNumberAndStop(busNumber, stops));
    }
}
