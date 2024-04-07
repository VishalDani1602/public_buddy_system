package com.example.publicbuddysystem.Controller;

import com.example.publicbuddysystem.Model.ActiveTransit;
import com.example.publicbuddysystem.Service.TransitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transits")
@CrossOrigin
public class TransitController {
    private final TransitService transitService;

    @Autowired
    public TransitController(TransitService transitService) {
        this.transitService = transitService;
    }

    @PostMapping("/create")
    public ActiveTransit createTransit(@RequestBody ActiveTransit transit) {
        return transitService.createActiveTransit(transit);
    }

    @GetMapping("/allTransits")
    public List<ActiveTransit> getAllTransits() {
        return transitService.getAllActiveTransits();
    }

    @GetMapping("/{activeTransit_ID}")
    public Optional<ActiveTransit> getActiveTransitById(@PathVariable("activeTransit_ID") Integer activeTransitId) {
        return transitService.getActiveTransitById(activeTransitId);
    }

    @DeleteMapping("/{activeTransit_ID}")
    public ResponseEntity<String> deleteActiveTransit(@PathVariable("activeTransit_ID") Integer activeTransitId) {
        transitService.deleteActiveTransit(activeTransitId);
        return ResponseEntity.ok("Active Transit Deleted");
    }
}
