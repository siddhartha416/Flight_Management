package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.PassengerDao;
import com.project.Flight_Management_System.dto.Passenger;

@Service
public class PassengerService {
	@Autowired
	PassengerDao passengerDao;
	
	public Passenger savePassenger(Passenger passenger ) {
		return passengerDao.savePassenger(passenger);
	}
	public Passenger fetchPassengerById(int passengerId) {
		return passengerDao.fetchPassengerById(passengerId);
	}
	public Passenger deletePassengerById(int passengerId) {
		
		return passengerDao.deletePassengerById(passengerId);
	}
	public Passenger updatePassengerById(int oldPassengerId,Passenger newPassenger) {
		return passengerDao.updatePassengerById(oldPassengerId, newPassenger);
	}
	public List<Passenger> fetchPassengerAll() {
		return passengerDao.fetchPassengerAll();
	}
	public Passenger addExistingPassportToExistingPassenger(int passengerId,int passportId) {
		
		return passengerDao.addExistingPassportToExistingPassenger(passengerId, passportId);
	}

}
