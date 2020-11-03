package com.example.spacefly.funcionality;

import com.example.spacefly.dataStructure.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightDAO extends CrudRepository<Flight,Integer> {

List<Flight> findAll();

Flight  findFlightByFlight_id(Integer id);

}
