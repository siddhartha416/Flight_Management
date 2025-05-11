package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.AirhostessDao;
import com.project.Flight_Management_System.dto.Airhostess;

@Service
public class AirhostessService {
     @Autowired
	AirhostessDao airhostessDao;
     
 	public Airhostess saveAirhostess(Airhostess airhostess) {
		return airhostessDao.saveAirhostess(airhostess);
	}
	public Airhostess fetchAirhostessById(int airhostessId) {
		return airhostessDao.fetchAirhostessById(airhostessId);
	}
	public Airhostess deleteAirhostessById(int airhostessId) {
		
		return airhostessDao.deleteAirhostessById(airhostessId);
	}
	public Airhostess updateAirhostessById(int oldAirhostessId, Airhostess newAirhostess) {
		return airhostessDao.updateAirhostessById(oldAirhostessId, newAirhostess);
	}
	public List<Airhostess> fetchAirhostessAll(){
		return airhostessDao.fetchAirhostessAll();
	}
}
