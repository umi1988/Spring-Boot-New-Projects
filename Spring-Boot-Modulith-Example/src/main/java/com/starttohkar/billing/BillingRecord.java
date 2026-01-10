package com.starttohkar.billing;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name="billing_record")
@Entity
public class BillingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleNumber;
    private double amount;
    private LocalDateTime billingTime;

    public BillingRecord() {
    }

    public BillingRecord(Long id, String vehicleNumber, double amount, LocalDateTime billingTime) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.amount = amount;
        this.billingTime = billingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getBillingTime() {
        return billingTime;
    }

    public void setBillingTime(LocalDateTime billingTime) {
        this.billingTime = billingTime;
    }

    @Override
    public String toString() {
        return "BillingRecord{" +
                "id=" + id +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", amount=" + amount +
                ", billingTime=" + billingTime +
                '}';
    }
}
