package com.starttohkar.dto;

public class TravelRequest {

    private String userId;
    private String destination;
    private String travelDate;

    public TravelRequest() {
    }

    public TravelRequest(String userId, String destination, String travelDate) {
        this.userId = userId;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    @Override
    public String toString() {
        return "TravelRequest{" +
                "userId='" + userId + '\'' +
                ", destination='" + destination + '\'' +
                ", travelDate='" + travelDate + '\'' +
                '}';
    }
}
