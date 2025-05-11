package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.SeatDao;
import com.project.Flight_Management_System.dto.Seat;

@Service
public class SeatService {
    @Autowired
	SeatDao  seatDao;
    
    public Seat saveSeat(Seat seat) {
		return seatDao.saveSeat(seat);
	}
	public Seat fetchSeatById(int seatId) {
		return seatDao.fetchSeatById(seatId);
	}
	public Seat deleteSeatById(int seatId) {
		
		return seatDao.deleteSeatById(seatId);
	}
	public Seat updateSeatById(int oldSeatId,Seat newSeat) {
		return seatDao.updateSeatById(oldSeatId, newSeat);
	}
	public List<Seat> fetchSeatAll(){
		return seatDao.fetchSeatAll();
	}
}
