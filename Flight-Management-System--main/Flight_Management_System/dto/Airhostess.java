package com.project.Flight_Management_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Airhostess {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airhosteesId;
	private String airhosteesName;
	private double airhosteesSalary;
	private int airhosteesAge;
	private long airhosteesPhone;
	public int getAirhosteesId() {
		return airhosteesId;
	}
	public void setAirhosteesId(int airhosteesId) {
		this.airhosteesId = airhosteesId;
	}
	public String getAirhosteesName() {
		return airhosteesName;
	}
	public void setAirhosteesName(String airhosteesName) {
		this.airhosteesName = airhosteesName;
	}
	public double getAirhosteesSalary() {
		return airhosteesSalary;
	}
	public void setAirhosteesSalary(double airhosteesSalary) {
		this.airhosteesSalary = airhosteesSalary;
	}
	public int getAirhosteesAge() {
		return airhosteesAge;
	}
	public void setAirhosteesAge(int airhosteesAge) {
		this.airhosteesAge = airhosteesAge;
	}
	public long getAirhosteesPhone() {
		return airhosteesPhone;
	}
	public void setAirhosteesPhone(long airhosteesPhone) {
		this.airhosteesPhone = airhosteesPhone;
	}
	
	
}
