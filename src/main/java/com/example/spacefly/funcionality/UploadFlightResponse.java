package com.example.spacefly.funcionality;

import java.time.LocalDateTime;

public class UploadFlightResponse {

    private LocalDateTime dateAndTimeOutlet;
    private LocalDateTime getDateAndTimeArrival;
    private Integer numberOfSeats;
    private Integer numberOfTurists;
    private Double ticketCost;

    public UploadFlightResponse(LocalDateTime dateAndTimeOutlet, LocalDateTime getDateAndTimeArrival, Integer numberOfSeats, Integer numberOfTurists, Double ticketCost) {
        this.dateAndTimeOutlet = dateAndTimeOutlet;
        this.getDateAndTimeArrival = getDateAndTimeArrival;
        this.numberOfSeats = numberOfSeats;
        this.numberOfTurists = numberOfTurists;
        this.ticketCost = ticketCost;
    }

    public LocalDateTime getDateAndTimeOutlet() {
        return dateAndTimeOutlet;
    }

    public void setDateAndTimeOutlet(LocalDateTime dateAndTimeOutlet) {
        this.dateAndTimeOutlet = dateAndTimeOutlet;
    }

    public LocalDateTime getGetDateAndTimeArrival() {
        return getDateAndTimeArrival;
    }

    public void setGetDateAndTimeArrival(LocalDateTime getDateAndTimeArrival) {
        this.getDateAndTimeArrival = getDateAndTimeArrival;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfTurists() {
        return numberOfTurists;
    }

    public void setNumberOfTurists(Integer numberOfTurists) {
        this.numberOfTurists = numberOfTurists;
    }

    public Double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(Double ticketCost) {
        this.ticketCost = ticketCost;
    }
}
