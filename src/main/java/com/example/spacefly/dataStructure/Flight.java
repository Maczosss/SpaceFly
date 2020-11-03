package com.example.spacefly.dataStructure;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Integer flight_id;
    private LocalDateTime dateAndTimeOutlet;
    private LocalDateTime getDateAndTimeArrival;
    private Integer numberOfSeats;
    private Integer numberOfTurists;
    private Double ticketCost;

    @ManyToMany
    @JoinColumn(name = "TOURIST_ID")
    private List<Tourist> listOfTourists;


    public Flight(LocalDateTime dateAndTimeOutlet, LocalDateTime getDateAndTimeArrival, Integer numberOfSeats, Integer numberOfTurists, Double ticketCost) {
        this.dateAndTimeOutlet = dateAndTimeOutlet;
        this.getDateAndTimeArrival = getDateAndTimeArrival;
        this.numberOfSeats = numberOfSeats;
        this.numberOfTurists = numberOfTurists;
        this.ticketCost = ticketCost;
    }

    public Flight() {
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public LocalDateTime getDateAndTimeOutlet() {
        return dateAndTimeOutlet;
    }

    public LocalDateTime getGetDateAndTimeArrival() {
        return getDateAndTimeArrival;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public Integer getNumberOfTurists() {
        return numberOfTurists;
    }

    public Double getTicketCost() {
        return ticketCost;
    }

    public List<Tourist> getListOfTourists() {
        return listOfTourists;
    }
}
