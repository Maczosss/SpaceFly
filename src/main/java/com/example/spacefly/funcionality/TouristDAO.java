package com.example.spacefly.funcionality;

import com.example.spacefly.dataStructure.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristDAO extends CrudRepository<Tourist,Integer> {

    List<Tourist> findAll();
}
