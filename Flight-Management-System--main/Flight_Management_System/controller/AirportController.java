package com.project.Flight_Management_System.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Flight_Management_System.dto.Airport;
import com.project.Flight_Management_System.dto.Flight;
import com.project.Flight_Management_System.service.AirportService;
import com.project.Flight_Management_System.util.ResponseStructure;
import com.project.Flight_Management_System.util.ResponseStructureAll;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class AirportController {
	@Autowired
	AirportService  airportService;
//	200 deleted/update
//	201 create
//	fetch 302
	
	 @Operation(summary = "Save Airport", description = "API is used to save the Airport")
	 @ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Successfully  airport created"),
	 @ApiResponse(responseCode = "404", description = "Airport not found for the given id") })
	@PostMapping("/saveAirport")
	public ResponseStructure<Airport> saveAirport(@RequestBody Airport airport) {
		return airportService.saveAirport(airport);
	}
	 @Operation(summary = "fetchAirportById", description = "API is used to fetch the Airport")
	 @ApiResponses(value = { @ApiResponse(responseCode = "302", description = "Successfully  airport fetched"),
	 @ApiResponse(responseCode = "404", description = "Airport not found for the given id") })
	@GetMapping("/fetchAirportById")
	public ResponseStructure<Airport> fetchAirportById(@RequestParam int airportId) {
		return airportService.fetchAirportById(airportId);
	}
	 @Operation(summary = "deleteAirportById", description = "API is used to delete the Airport")
	 @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully  airport deleted"),
	 @ApiResponse(responseCode = "404", description = "Airport not found for the given id") })
	@DeleteMapping("/deleteAirportById")
	public ResponseStructure<Airport> deleteAirportById(@RequestParam int airportId) {
		
		return airportService.deleteAirportById(airportId);
	}
	 @Operation(summary = "updateAirportById", description = "API is used to update the Airport")
	 @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully  airport updated"),
	 @ApiResponse(responseCode = "404", description = "Airport not found for the given id") })
	@PutMapping("/updateAirportById")
	public ResponseStructure<Airport> updateAirportById(@RequestParam int oldAirportId,@RequestBody Airport newAirport) {
		return airportService.updateAirportById(oldAirportId, newAirport);
	}
	 @Operation(summary = "fetchAirportAll", description = "API is used to fetch all the Airport")
	 @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully  All airport fetched "),
	 @ApiResponse(responseCode = "404", description = "Airport not found for the given id") })
	@GetMapping("/fetchAirportAll")
	public ResponseStructureAll<Airport> fetchAirportAll(){
		return airportService.fetchAirportAll();
	}
	@PutMapping("/addExistingAddressToExistingAirport")
    public Airport addExistingAddressToExistingAirport(@RequestParam int airportId, @RequestParam int addressId) {
		
		return airportService.addExistingAddressToExistingAirport(airportId, addressId);
	}
	@PutMapping("/addExistingFlightToExistingAirport")
    public Airport addExistingFlightToExistingAirport(@RequestParam int airportId,@RequestParam int flightId) {
		
		return airportService.addExistingFlightToExistingAirport(airportId, flightId);
	}
	@PutMapping("/addNewFlightToExistingAirport")
    public Airport addNewFlightToExistingAirport(@RequestParam int airportId,@RequestBody Flight newFlight) {
		
		return airportService.addNewFlightToExistingAirport(airportId, newFlight);
	}

}
