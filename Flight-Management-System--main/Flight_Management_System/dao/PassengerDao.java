package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Passenger;
import com.project.Flight_Management_System.dto.Passport;
import com.project.Flight_Management_System.repo.PassengerRepo;

@Repository
public class PassengerDao {

	@Autowired
	PassengerRepo passengerRepo;
	@Autowired
	PassportDao passportDao;
	
	public Passenger savePassenger(Passenger passenger ) {
		return passengerRepo.save(passenger);
	}
	public Passenger fetchPassengerById(int passengerId) {
		return passengerRepo.findById(passengerId).get();
	}
	public Passenger deletePassengerById(int passengerId) {
		Passenger passenger=fetchPassengerById(passengerId);
		passengerRepo.delete(passenger);
		return passenger;
	}
	public Passenger updatePassengerById(int oldPassengerId,Passenger newPassenger) {
		newPassenger.setPassengerId(oldPassengerId);
		return passengerRepo.save(newPassenger);
	}
	public List<Passenger> fetchPassengerAll() {
		return passengerRepo.findAll();
	}
	public Passenger addExistingPassportToExistingPassenger(int passengerId,int passportId) {
		Passenger passenger=fetchPassengerById(passengerId);
		Passport passport=passportDao.fetchPassportById(passportId);
		passenger.setPassport(passport);
		return passengerRepo.save(passenger);
	}
}
