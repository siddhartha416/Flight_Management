package com.project.Flight_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Flight_Management_System.dto.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
