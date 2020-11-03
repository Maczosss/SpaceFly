package com.example.spacefly.dataStructure;


import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Tourist {

    @Id
    @GeneratedValue
    private Integer tourist_id;
    private String name;
    private String surName;
    private String sex;
    private String country;
    private String notes;
    private LocalDate dateOfBirth; //yyyy-MM-dd

    @ManyToMany
    @JoinColumn(name = "FLIGHT_ID")
    private List<Flight> listOfFlights;

    public Tourist() {
    }

    public Tourist(String name, String surName, String sex, String country, String notes,
                   LocalDate dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        this.country = country;
        this.notes = notes;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(List<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
}
