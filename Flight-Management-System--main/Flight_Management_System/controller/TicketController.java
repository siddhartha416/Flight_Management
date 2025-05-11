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

import com.project.Flight_Management_System.dto.Ticket;
import com.project.Flight_Management_System.service.TicketService;

@RestController
public class TicketController {
     @Autowired
	TicketService  ticketService;
     
     @PostMapping("/saveTicket")
     public Ticket saveTicket(@RequestBody Ticket ticket) {
       	 return ticketService.saveTicket(ticket);
        }
        @GetMapping("/fetchTicketById") 
      public Ticket fetchTicketById(@RequestParam int ticketId) {
       	 return ticketService.fetchTicketById(ticketId);
        }
        @DeleteMapping("/deleteTicketById")
      public Ticket deleteTicketById(@RequestParam int ticketId) {
       	    	 return ticketService.deleteTicketById(ticketId);
        }
        @PutMapping("/updateTicketById")
      public Ticket updateTicketById(@RequestParam int oldTicketId,@RequestBody Ticket newTicket) {
       	 return ticketService.updateTicketById(oldTicketId, newTicket);
        }
        @GetMapping("/fetchTicketAll")
      public List<Ticket> fetchTicketAll(){
       	 return ticketService.fetchTicketAll();
        }

}
