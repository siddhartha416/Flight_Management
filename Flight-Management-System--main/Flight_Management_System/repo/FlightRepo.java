package com.project.Flight_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Flight_Management_System.dto.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer> {

}
