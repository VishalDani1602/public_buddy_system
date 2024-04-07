package com.example.publicbuddysystem.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="activetransits")
public class ActiveTransit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="activetransit_id")
    private Integer activeTransit_ID;

    @Column(name="User_ID")
    private Integer user_ID;

    @Column(name="Bus_Number")
    private Integer busNumber;

    @Column(name="Start_Stop")
    private String start;

    @Column(name="Time")
    private LocalDateTime time;

    @Column(name="Status")
    private String status;

    public Integer getID() {
        return this.activeTransit_ID;
    }

    public Integer getUserID() {
        return this.user_ID;
    }

    public Integer getBusNumber() {
        return this.busNumber;
    }

    public String getStart() {
        return this.start;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public String getStatus() {
        return this.status;
    }
}
