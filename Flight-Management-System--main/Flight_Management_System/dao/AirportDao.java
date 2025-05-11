package com.project.Flight_Management_System.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Address;
import com.project.Flight_Management_System.dto.Airport;
import com.project.Flight_Management_System.dto.Flight;
import com.project.Flight_Management_System.repo.AirportRepo;

@Repository
public class AirportDao {
	
	@Autowired
	AirportRepo airportRepo;
	@Autowired
	AddressDao addressDao;
	
	@Autowired
	FlightDao flightDao;
	
	public Airport saveAirport(Airport airport) {
		return airportRepo.save(airport);
	}
	public Airport fetchAirportById(int airportId) {
//		return airportRepo.findById(airportId).get();
		Optional<Airport> airport=airportRepo.findById(airportId);
		if(airport.isPresent()) {
			return airport.get();
		}else {
			return null;
		}
	}
	public Airport deleteAirportById(int airportId) {
		Airport  airport=fetchAirportById(airportId);
		airportRepo.delete(airport);
		return airport;
	}
	public Airport updateAirportById(int oldAirportId,Airport newAirport) {
		newAirport.setAirportId(oldAirportId);
		return airportRepo.save(newAirport);
	}
	public List<Airport> fetchAirportAll(){
		return airportRepo.findAll();
	}
	public Airport addExistingAddressToExistingAirport(int airportId,int addressId) {
		Airport airport=fetchAirportById(airportId);
		Address address=addressDao.fetchAddressById(addressId);
		airport.setAddress(address);
		return airportRepo.save(airport);
	}
	public Airport addExistingFlightToExistingAirport(int airportId,int flightId) {
		Airport airport=fetchAirportById(airportId);
		Flight flight=flightDao.fetchFlighttById(flightId);
		List<Flight> list=airport.getFlights();
		list.add(flight);
		airport.setFlights(list);
		return airportRepo.save(airport);
	}
	public Airport addNewFlightToExistingAirport(int airportId,Flight newFlight) {
		Airport airport=fetchAirportById(airportId);
		List<Flight> list=airport.getFlights();
		list.add(newFlight);
		airport.setFlights(list);
		return airportRepo.save(airport);
	}
	

}
