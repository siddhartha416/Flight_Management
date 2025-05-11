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

import com.project.Flight_Management_System.dto.Passport;
import com.project.Flight_Management_System.service.PassportService;

@RestController
public class PassportController {
    @Autowired
	PassportService passportService;
    @PostMapping("/savePassport")
    public Passport savePassport(@RequestBody Passport passport) {
    	return passportService.savePassport(passport);
    }
    @GetMapping("/fetchPassportById")
    public Passport fetchPassportById(@RequestParam int passportId) {
    	return passportService.fetchPassportById(passportId);
    }
    @DeleteMapping("/deletePassportById")
    public Passport deletePassportById(@RequestParam int passportId) {
    	return passportService.deletePassportById(passportId);
    }
    @PutMapping("/updatePassportById")
    public Passport updatePassportById(@RequestParam int oldPassportId,@RequestBody Passport newPassport) {
    	return passportService.updatePassportById(oldPassportId, newPassport);
    }
    @GetMapping("/fetchPassportAll")
    public List<Passport> fetchPassportAll() {
    	return passportService.fetchPassportAll();
    }
}
