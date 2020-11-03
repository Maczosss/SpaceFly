package com.example.spacefly;

import com.example.spacefly.dataStructure.Flight;
import com.example.spacefly.dataStructure.Tourist;
import com.example.spacefly.funcionality.FlightDAO;
import com.example.spacefly.funcionality.TouristDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class InitialData implements ApplicationRunner {

    private FlightDAO flightDAO;
    private TouristDAO touristDAO;

    @Autowired
    public InitialData(FlightDAO flightDAO, TouristDAO touristDAO) {
        this.flightDAO = flightDAO;
        this.touristDAO = touristDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        LocalDateTime localDateTime1 = LocalDateTime.of(2018,11,11,12,23);
        LocalDateTime localDateTime2 = LocalDateTime.of(2018,11,11,12,23);

        Flight fight1 = new Flight(LocalDateTime.of(2018,11,11,12,23),
                LocalDateTime.of(2018,12,12,13,23),
                100,80,22.0);
        Flight fight2 = new Flight(LocalDateTime.of(2017,11,11,12,23),
                LocalDateTime.of(2018,12,12,13,23),
                150,122,23.0);

        flightDAO.save(fight1);
        flightDAO.save(fight2);


        ArrayList<Flight> listOfFlightForTourist1;


        Tourist tourist1 = new Tourist("Jan","Nowak","M","Poland","smoking",
                LocalDate.of(1994,10,10));
//        Tourist tourist2 = new Tourist("Jan","Nowak","M","Poland","smoking",
//                LocalDate.of(1994,10,10));


        touristDAO.save(tourist1);
    }
}
