package com.example.publicbuddysystem.Controller;

import com.example.publicbuddysystem.Model.Bus;
import com.example.publicbuddysystem.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    @GetMapping("/busmap/{busNumber}")
    public ResponseEntity<String> getBusMap(@PathVariable Integer busNumber) {
        try {
            // Read content of buses.json file
            ClassPathResource resource;
            if(busNumber == 5) {
                resource = new ClassPathResource("5_response.json");
            } else{
                resource = new ClassPathResource("31_response.json");
            }
            byte[] bytes = Files.readAllBytes(Paths.get(resource.getURI()));

            String jsonData = new String(bytes);

            // Return JSON response
            return ResponseEntity.ok(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error reading JSON file");
        }
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
