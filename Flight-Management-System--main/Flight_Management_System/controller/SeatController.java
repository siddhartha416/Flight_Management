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

import com.project.Flight_Management_System.dto.Seat;
import com.project.Flight_Management_System.service.SeatService;

@RestController
public class SeatController {
    @Autowired
	SeatService seatService;
    @PostMapping("/saveSeat")
    public Seat saveSeat(@RequestBody Seat seat) {
		return seatService.saveSeat(seat);
	}
    @GetMapping("/fetchSeatById")
	public Seat fetchSeatById(@RequestParam int seatId) {
		return seatService.fetchSeatById(seatId);
	}
    @DeleteMapping("/deleteSeatById")
	public Seat deleteSeatById(@RequestParam int seatId) {
		
		return seatService.deleteSeatById(seatId);
	}
    @PutMapping("/updateSeatById")
	public Seat updateSeatById(@RequestParam int oldSeatId,@RequestBody Seat newSeat) {
		return seatService.updateSeatById(oldSeatId, newSeat);
	}
    @GetMapping("/fetchSeatAll")
	public List<Seat> fetchSeatAll(){
		return seatService.fetchSeatAll();
	}
}
