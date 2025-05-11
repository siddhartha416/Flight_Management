package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.FlightDao;
import com.project.Flight_Management_System.dto.Flight;

@Service
public class FlightService {
	@Autowired
	FlightDao flightDao;
	
	public Flight saveFlight(Flight flight) {
		return flightDao.saveFlight(flight);
	}
	public Flight fetchFlighttById(int flightId) {
		return flightDao.fetchFlighttById(flightId);
	}
	public Flight deleteFlightById(int flightId) {
		return flightDao.deleteFlightById(flightId);
	}
	public Flight updateFlightById(int oldFlightId,Flight newFlight) {
		return flightDao.updateFlightById(oldFlightId, newFlight);
	}
	public List<Flight> fetchFlightAll(){
		return flightDao.fetchFlightAll();
	}

}
