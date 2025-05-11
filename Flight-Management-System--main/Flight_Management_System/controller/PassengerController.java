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

import com.project.Flight_Management_System.dto.Passenger;
import com.project.Flight_Management_System.service.PassengerService;

@RestController
public class PassengerController {
    @Autowired
	PassengerService passengerService;
    @PostMapping("/savePassenger")
	public Passenger savePassenger(@RequestBody Passenger passenger ) {
		return passengerService.savePassenger(passenger);
	}
    @GetMapping("/fetchPassengerById")
	public Passenger fetchPassengerById(@RequestParam int passengerId) {
		return passengerService.fetchPassengerById(passengerId);
	}
    @DeleteMapping("/deletePassengerById")
	public Passenger deletePassengerById(@RequestParam int passengerId) {
		
		return passengerService.deletePassengerById(passengerId);
	}
    @PutMapping("/updatePassengerById")
	public Passenger updatePassengerById(@RequestParam int oldPassengerId,@RequestBody Passenger newPassenger) {
		return passengerService.updatePassengerById(oldPassengerId, newPassenger);
	}
    @GetMapping("/fetchPassengerAll")
	public List<Passenger> fetchPassengerAll() {
		return passengerService.fetchPassengerAll();
	}
    @PutMapping("/addExistingPassportToExistingPassenger")
   public Passenger addExistingPassportToExistingPassenger(@RequestParam int passengerId,@RequestParam int passportId) {
		
		return passengerService.addExistingPassportToExistingPassenger(passengerId, passportId);
	}
}
