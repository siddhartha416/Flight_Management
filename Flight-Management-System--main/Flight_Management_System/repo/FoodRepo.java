package com.project.Flight_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Flight_Management_System.dto.Food;

public interface FoodRepo extends JpaRepository<Food, Integer> {

}
