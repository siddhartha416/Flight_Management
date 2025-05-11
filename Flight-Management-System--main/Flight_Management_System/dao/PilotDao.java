package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Pilot;
import com.project.Flight_Management_System.repo.PilotRepo;

@Repository
public class PilotDao {

	@Autowired
	PilotRepo pilotRepo;
	
	public Pilot savePilot(Pilot pilot) {
		return pilotRepo.save(pilot);
	}
	public Pilot fetchPilotById(int pilotId) {
		return pilotRepo.findById(pilotId).get();
	}
	public Pilot deletePilotById(int pilotId) {
		Pilot pilot=fetchPilotById(pilotId);
		pilotRepo.delete(pilot);
		return pilot;
	}
	public Pilot updatePilotById(int oldpilotId,Pilot newPilot) {
		newPilot.setPilotId(oldpilotId);
		return pilotRepo.save(newPilot);
	}
	public List<Pilot> fetchPilotAll() {
		return pilotRepo.findAll();
	}
}
