package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.PassportDao;
import com.project.Flight_Management_System.dto.Passport;

@Service
public class PassportService {
     @Autowired
	PassportDao passportDao;
	
	 public Passport savePassport(Passport passport) {
	    	return passportDao.savePassport(passport);
	    }
	    public Passport fetchPassportById(int passportId) {
	    	return passportDao.fetchPassportById(passportId);
	    }
	    public Passport deletePassportById(int passportId) {
	    	return passportDao.deletePassportById(passportId);
	    }
	    public Passport updatePassportById(int oldPassportId,Passport newPassport) {
	    	return passportDao.updatePassportById(oldPassportId, newPassport);
	    }
	    public List<Passport> fetchPassportAll() {
	    	return passportDao.fetchPassportAll();
	    }
}
