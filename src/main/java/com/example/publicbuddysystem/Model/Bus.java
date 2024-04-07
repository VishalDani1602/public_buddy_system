package com.example.publicbuddysystem.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Bus")
public class Bus {
    @Column(name = "busnumber", nullable = false)
    private Integer busNumber;

    @Column(name = "Stops", nullable = false)
    private String stops;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Bus() {
    }

    public void setBusId(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}