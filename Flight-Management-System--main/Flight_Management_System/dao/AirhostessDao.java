package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Airhostess;
import com.project.Flight_Management_System.repo.AirhostessRepo;

@Repository
public class AirhostessDao {
	@Autowired
	AirhostessRepo airhostessRepo;

	public Airhostess saveAirhostess(Airhostess airhostess) {
		return airhostessRepo.save(airhostess);
	}
	public Airhostess fetchAirhostessById(int airhostessId) {
		return airhostessRepo.findById(airhostessId).get();
	}
	public Airhostess deleteAirhostessById(int airhostessId) {
		Airhostess airhostess=fetchAirhostessById(airhostessId);
		airhostessRepo.delete(airhostess);
		return airhostess;
	}
	public Airhostess updateAirhostessById(int oldAirhostessId, Airhostess newAirhostess) {
		newAirhostess.setAirhosteesId(oldAirhostessId);
		return airhostessRepo.save(newAirhostess);
	}
	public List<Airhostess> fetchAirhostessAll(){
		return airhostessRepo.findAll();
	}
}
