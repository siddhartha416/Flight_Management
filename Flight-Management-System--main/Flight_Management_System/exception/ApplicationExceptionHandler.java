package com.project.Flight_Management_System.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.Flight_Management_System.util.ResponseStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    @Autowired
	ResponseStructure<String>responseStructure;
    @ExceptionHandler(AirportIdNotFound.class)
    public ResponseStructure<String> airportIdNotFound(AirportIdNotFound airportIdNotFound){
    	responseStructure.setMessage("Airport Id Not Found");
    	responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
    	responseStructure.setData(airportIdNotFound.getMessage());
    	return responseStructure;
    }
}
