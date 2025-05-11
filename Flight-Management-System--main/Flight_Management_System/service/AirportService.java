package com.project.Flight_Management_System.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.AirportDao;
import com.project.Flight_Management_System.dto.Airport;
import com.project.Flight_Management_System.dto.Flight;
import com.project.Flight_Management_System.exception.AirportIdNotFound;
import com.project.Flight_Management_System.util.ResponseStructure;
import com.project.Flight_Management_System.util.ResponseStructureAll;

@Service
public class AirportService {
	@Autowired
	AirportDao airportDao;
	@Autowired
	ResponseStructure<Airport>responseStructure;
	@Autowired
	ResponseStructureAll<Airport> responseStructureAll;
	
	public ResponseStructure<Airport> saveAirport(Airport airport) {
		responseStructure.setMessage("SuccessFully Data saved into the Database");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setData(airportDao.saveAirport(airport));
		return responseStructure;
		
	}
	public ResponseStructure<Airport> fetchAirportById(int airportId) {
		Airport airport=airportDao.fetchAirportById(airportId);
		if(airport!=null) {
		responseStructure.setMessage("Successfully Data fetched From the Database");
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setData(airportDao.fetchAirportById(airportId));
		return responseStructure;
		}else {
			throw new AirportIdNotFound();
		}
	}
	public ResponseStructure<Airport> deleteAirportById(int airportId) {
		responseStructure.setMessage("SuccessFully Data Deleted From the Database");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(airportDao.deleteAirportById(airportId));
		return responseStructure;
	}
	public ResponseStructure<Airport> updateAirportById(int oldAirportId,Airport newAirport) {
		responseStructure.setMessage("Airport Is updated SuccessFully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(airportDao.updateAirportById(oldAirportId, newAirport));
		return responseStructure;
	}
	public ResponseStructureAll<Airport> fetchAirportAll(){
		responseStructureAll.setMessage("SuceessFully All Data Fetched from the Dtabase");
		responseStructureAll.setStatusCode(HttpStatus.FOUND.value());
		responseStructureAll.setData(airportDao.fetchAirportAll());
		return responseStructureAll;
	}
	public Airport addExistingAddressToExistingAirport(int airportId,int addressId) {
		return airportDao.addExistingAddressToExistingAirport(airportId, addressId);
	}
	public Airport addExistingFlightToExistingAirport(int airportId,int flightId) {
		
		return airportDao.addExistingFlightToExistingAirport(airportId, flightId);
	}
	public Airport addNewFlightToExistingAirport(int airportId,Flight newFlight) {
		
		return airportDao.addNewFlightToExistingAirport(airportId, newFlight);
	}

}
