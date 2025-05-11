package com.project.Flight_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Flight_Management_System.dto.Flight;
import com.project.Flight_Management_System.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	FlightService flightService;
	@PostMapping("/saveFlight")
	public Flight saveFlight(@RequestBody Flight flight) {
		return flightService.saveFlight(flight);
	}
	@GetMapping("/fetchFlighttById")
	public Flight fetchFlighttById(@RequestParam int flightId) {
		return flightService.fetchFlighttById(flightId);
	}
	@DeleteMapping("/deleteFlightById")
	public Flight deleteFlightById(@RequestParam int flightId) {
		return flightService.deleteFlightById(flightId);
	}
	@PutMapping("/updateFlightById")
	public Flight updateFlightById(@RequestParam int oldFlightId,@RequestBody Flight newFlight) {
		return flightService.updateFlightById(oldFlightId, newFlight);
	}
	@GetMapping("/fetchFlightAll")
	public List<Flight> fetchFlightAll(){
		return flightService.fetchFlightAll();
	}

}
