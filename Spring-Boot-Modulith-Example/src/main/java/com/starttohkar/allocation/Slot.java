package com.starttohkar.allocation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="slot")
@Entity
public class Slot {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String slotCode;//A1,B1,C1 etc.
    private boolean available;
    private String vehicleNumber; // optional (for tracking allocation)

    public Slot() {
    }

    public Slot(Long id, String slotCode, boolean available, String vehicleNumber) {
        this.id = id;
        this.slotCode = slotCode;
        this.available = available;
        this.vehicleNumber = vehicleNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlotCode() {
        return slotCode;
    }

    public void setSlotCode(String slotCode) {
        this.slotCode = slotCode;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "id=" + id +
                ", slotCode='" + slotCode + '\'' +
                ", available=" + available +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}