package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Passport;
import com.project.Flight_Management_System.repo.PassportRepo;

@Repository
public class PassportDao {
    @Autowired
	PassportRepo  passportRepo;
    
    public Passport savePassport(Passport passport) {
    	return passportRepo.save(passport);
    }
    public Passport fetchPassportById(int passportId) {
    	return passportRepo.findById(passportId).get();
    }
    public Passport deletePassportById(int passportId) {
    	Passport passport=fetchPassportById(passportId);
    	passportRepo.delete(passport);
    	return passport;
    }
    public Passport updatePassportById(int oldPassportId,Passport newPassport) {
    	newPassport.setPassportId(oldPassportId);
    	return passportRepo.save(newPassport);
    }
    public List<Passport> fetchPassportAll() {
    	return passportRepo.findAll();
    }
}
