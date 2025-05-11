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

import com.project.Flight_Management_System.dto.Food;
import com.project.Flight_Management_System.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	FoodService foodService;
	@PostMapping("/saveFood")
	public Food saveFood(@RequestBody Food food) {
		return foodService.saveFood(food);
	}
	@GetMapping("/fetchFoodById")
	public Food fetchFoodById(@RequestParam int foodId) {
		return foodService.fetchFoodById(foodId);
	}
	@DeleteMapping("/deleteFoodById")
	public Food deleteFoodById(@RequestParam int foodId) {
		
		return foodService.deleteFoodById(foodId);
	}
	@PutMapping("/updateFoodById")
	public Food updateFoodById(@RequestParam int oldFoodId,@RequestBody Food newFood) {
		return foodService.updateFoodById(oldFoodId, newFood);
	}
	@GetMapping("/fetchFoodAll")
	public List<Food> fetchFoodAll(){
		return foodService.fetchFoodAll();
				
	}

}
