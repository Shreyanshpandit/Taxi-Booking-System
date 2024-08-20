package com.project.TaxiBookingSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cabId;
    
    private String carType;
    private float perKMRate;

    // Getters and Setters
    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public float getPerKMRate() {
        return perKMRate;
    }

    public void setPerKMRate(float perKMRate) {
        this.perKMRate = perKMRate;
    }
}
