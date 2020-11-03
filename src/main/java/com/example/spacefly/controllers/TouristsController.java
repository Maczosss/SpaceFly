package com.example.spacefly.controllers;


import com.example.spacefly.dataStructure.Tourist;
import com.example.spacefly.funcionality.TouristDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TouristsController {

    TouristDAO touristDAO;

    @Autowired
    public TouristsController(TouristDAO touristDAO) {
        this.touristDAO = touristDAO;
    }

    @RequestMapping(value = "/tourists", method = RequestMethod.GET)
    public List<Tourist> getTourists() {
        return touristDAO.findAll();
    }

    @RequestMapping(value = "/tourists",method = RequestMethod.POST)
    public Tourist addTourist(@RequestBody Tourist tourist) {
        touristDAO.save(tourist);
        return tourist;
    }

    @RequestMapping(value = "/add/tourist/{id}",method = RequestMethod.POST)
    public Tourist addTo(@RequestBody Tourist tourist, @RequestParam ("id") int id) {
        touristDAO.save(tourist);
        return tourist;
    }
}
