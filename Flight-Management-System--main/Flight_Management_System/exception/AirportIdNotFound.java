package com.project.Flight_Management_System.exception;

public class AirportIdNotFound extends RuntimeException {

	private String message="Airport Id not found in the DB";

	public String getMessage() {
		return message;
	}

	
	
}
