package com.project.Flight_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatId;
	private int seatNumber;
	private String seatType;
	private String seatColor;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getSeatColor() {
		return seatColor;
	}
	public void setSeatColor(String seatColor) {
		this.seatColor = seatColor;
	}
	
	
}
