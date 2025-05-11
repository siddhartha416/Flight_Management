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

import com.project.Flight_Management_System.dto.Pilot;
import com.project.Flight_Management_System.service.PilotService;

@RestController
public class PilotController {
    @Autowired
	PilotService pilotService;
    @PostMapping("/savePilot")
    public Pilot savePilot(@RequestBody Pilot pilot) {
		return pilotService.savePilot(pilot);
	}
    @GetMapping("/fetchPilotById")
	public Pilot fetchPilotById(@RequestParam int pilotId) {
		return pilotService.fetchPilotById(pilotId);
	}
    @DeleteMapping("/deletePilotById")
	public Pilot deletePilotById(@RequestParam int pilotId) {
		
		return pilotService.deletePilotById(pilotId);
	}
    @PutMapping("/updatePilotById")
	public Pilot updatePilotById(@RequestParam int oldpilotId,@RequestBody Pilot newPilot) {
		return pilotService.updatePilotById(oldpilotId, newPilot);
	}
    @GetMapping("/fetchPilotAll")
	public List<Pilot> fetchPilotAll() {
		return pilotService.fetchPilotAll();
	}
}
