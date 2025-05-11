package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Ticket;
import com.project.Flight_Management_System.repo.TicketRepo;

@Repository
public class TicketDao {
     @Autowired
	TicketRepo ticketRepo;
     
     public Ticket saveTicket(Ticket ticket) {
    	 return ticketRepo.save(ticket);
     }
     public Ticket fetchTicketById(int ticketId) {
    	 return ticketRepo.findById(ticketId).get();
     }
     public Ticket deleteTicketById(int ticketId) {
    	 Ticket ticket=fetchTicketById(ticketId);
    	 ticketRepo.delete(ticket);
    	 return ticket;
     }
     public Ticket updateTicketById(int oldTicketId,Ticket newTicket) {
    	 newTicket.setTicketId(oldTicketId);
    	 return ticketRepo.save(newTicket);
     }
     public List<Ticket> fetchTicketAll(){
    	 return ticketRepo.findAll();
     }
}
