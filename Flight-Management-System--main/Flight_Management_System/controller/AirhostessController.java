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

import com.project.Flight_Management_System.dto.Airhostess;
import com.project.Flight_Management_System.service.AirhostessService;

@RestController
public class AirhostessController {
	@Autowired
	AirhostessService airhostessService;
	@PostMapping("/saveAirhostess")
	public Airhostess saveAirhostess(@RequestBody Airhostess airhostess) {
		return airhostessService.saveAirhostess(airhostess);
	}
	@GetMapping("/fetchAirhostessById")
	public Airhostess fetchAirhostessById(@RequestParam int airhostessId) {
		return airhostessService.fetchAirhostessById(airhostessId);
	}
	@DeleteMapping("/deleteAirhostessById")
	public Airhostess deleteAirhostessById(@RequestParam int airhostessId) {
		
		return airhostessService.deleteAirhostessById(airhostessId);
	}
	@PutMapping("/updateAirhostessById")
	public Airhostess updateAirhostessById(@RequestParam int oldAirhostessId, @RequestBody Airhostess newAirhostess) {
		return airhostessService.updateAirhostessById(oldAirhostessId, newAirhostess);
	}
	@GetMapping("/fetchAirhostessAll")
	public List<Airhostess> fetchAirhostessAll(){
		return airhostessService.fetchAirhostessAll();
	}

}
