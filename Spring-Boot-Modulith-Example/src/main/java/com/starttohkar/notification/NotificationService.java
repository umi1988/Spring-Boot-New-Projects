package com.starttohkar.notification;

import com.starttohkar.event.VehicleEnteredEvent;
import com.starttohkar.event.VehicleExitedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @EventListener
    @Order(1)
    public void notifyOnVehicleEntry(VehicleEnteredEvent event) {
        // Logic to send notification to the user
        System.out.println("📩 Notification: Vehicle " + event.vehicleNumber() +
                " entered at " + event.entryTime() + ". Welcome!");
    }

    @EventListener
    public void notifyOnVehicleExit(VehicleExitedEvent event) {
        // Logic to send notification to the user
        System.out.println("📩 Notification: Vehicle " + event.vehicleNumber() + " has exited. Thank you for visiting!");
    }
}