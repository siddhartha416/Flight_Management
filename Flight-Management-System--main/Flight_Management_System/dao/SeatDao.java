package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Seat;
import com.project.Flight_Management_System.repo.SeatRepo;

@Repository
public class SeatDao {
	@Autowired
	SeatRepo seatRepo;

	public Seat saveSeat(Seat seat) {
		return seatRepo.save(seat);
	}
	public Seat fetchSeatById(int seatId) {
		return seatRepo.findById(seatId).get();
	}
	public Seat deleteSeatById(int seatId) {
		Seat seat=fetchSeatById(seatId);
		seatRepo.delete(seat);
		return seat;
	}
	public Seat updateSeatById(int oldSeatId,Seat newSeat) {
		newSeat.setSeatId(oldSeatId);
		return seatRepo.save(newSeat);
	}
	public List<Seat> fetchSeatAll(){
		return seatRepo.findAll();
	}
}
