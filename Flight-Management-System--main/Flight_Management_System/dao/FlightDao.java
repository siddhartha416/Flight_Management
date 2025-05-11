package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Flight;
import com.project.Flight_Management_System.repo.FlightRepo;

@Repository
public class FlightDao {
	@Autowired
	FlightRepo  flightRepo;
	
	public Flight saveFlight(Flight flight) {
		return flightRepo.save(flight);
	}
	public Flight fetchFlighttById(int flightId) {
		return flightRepo.findById(flightId).get();
	}
	public Flight deleteFlightById(int flightId) {
		Flight  flight=fetchFlighttById(flightId);
		flightRepo.delete(flight);
		return flight;
	}
	public Flight updateFlightById(int oldFlightId,Flight newFlight) {
		newFlight.setFlightId(oldFlightId);
		return flightRepo.save(newFlight);
	}
	public List<Flight> fetchFlightAll(){
		return flightRepo.findAll();
	}

}
