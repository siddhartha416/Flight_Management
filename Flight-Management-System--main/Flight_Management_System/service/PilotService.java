package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.PilotDao;
import com.project.Flight_Management_System.dto.Pilot;

@Service
public class PilotService {
    @Autowired
	PilotDao pilotDao;
    
    public Pilot savePilot(Pilot pilot) {
		return pilotDao.savePilot(pilot);
	}
	public Pilot fetchPilotById(int pilotId) {
		return pilotDao.fetchPilotById(pilotId);
	}
	public Pilot deletePilotById(int pilotId) {
		
		return pilotDao.deletePilotById(pilotId);
	}
	public Pilot updatePilotById(int oldpilotId,Pilot newPilot) {
		return pilotDao.updatePilotById(oldpilotId, newPilot);
	}
	public List<Pilot> fetchPilotAll() {
		return pilotDao.fetchPilotAll();
	}
}
