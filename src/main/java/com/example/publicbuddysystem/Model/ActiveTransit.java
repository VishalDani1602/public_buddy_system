package com.example.publicbuddysystem.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "activetransits")
public class ActiveTransit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activetransit_id")
    private Integer activeTransit_ID;

    @Column(name = "User_AID")
    private Integer user_AID;

    @Column(name = "Bus_Number")
    private Integer busNumber;

    @Column(name = "Start_Stop")
    private String start;

    @Column(name = "Time")
    private LocalDateTime time;

    @Column(name = "Status")
    private String status;

    public Integer getActiveTransit_ID() {
        return activeTransit_ID;
    }

    public void setActiveTransit_ID(Integer activeTransit_ID) {
        this.activeTransit_ID = activeTransit_ID;
    }

    public Integer getUser_AID() {
        return user_AID;
    }

    public void setUser_AID(Integer user_AID) {
        this.user_AID = user_AID;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
