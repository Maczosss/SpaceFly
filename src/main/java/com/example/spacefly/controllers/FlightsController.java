package com.example.spacefly.controllers;

import com.example.spacefly.dataStructure.Flight;
import com.example.spacefly.dataStructure.Tourist;
import com.example.spacefly.funcionality.FlightDAO;
import com.example.spacefly.funcionality.TouristDAO;
import com.example.spacefly.funcionality.UploadFlightResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightsController {

private FlightDAO flightDAO;

    @Autowired
    public FlightsController(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Flight> getAllFlights() {
        return flightDAO.findAll();
    }

    @RequestMapping(value = "/flights/{id}",method = RequestMethod.GET)
    public Flight getFlightById(@PathVariable("id") Integer id) {
        return flightDAO.findFlightByFlight_id(id);
    }

    @RequestMapping(value = "/flights",method = RequestMethod.POST)
    public UploadFlightResponse addFlight(@RequestBody Flight flight) {
        flightDAO.save(flight);
        return new UploadFlightResponse(flight.getDateAndTimeOutlet(),
                flight.getDateAndTimeOutlet(),flight.getNumberOfSeats(),flight.getNumberOfTurists(),flight.getTicketCost());
    }

}
