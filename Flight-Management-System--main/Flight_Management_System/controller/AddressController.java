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

import com.project.Flight_Management_System.dto.Address;
import com.project.Flight_Management_System.service.AddressService;



@RestController
public class AddressController {
//	200 deleted/update
//	201 create
//	fetch 302

     @Autowired
	AddressService addressService;
     
    
     @PostMapping("/saveAddress")
     public Address saveAddress(@RequestBody Address address) {
 		return addressService.saveAddress(address);
 	}
     @GetMapping("/fetchAddressById")
 	public Address fetchAddressById(@RequestParam int addressId) {
 		return addressService.fetchAddressById(addressId);
 	}
     @DeleteMapping("/deleteAddressById")
 	public Address deleteAddressById(@RequestParam int addressId) {
 		
 		return addressService.deleteAddressById(addressId);
 	}
     @PutMapping("/updateAddressById")
 	public Address updateAddressById(@RequestParam int oldAddressId, @RequestBody Address newaAddress) {
 		return addressService.updateAddressById(oldAddressId, newaAddress);
 	}
     @GetMapping("/fetchAddressAll")
 	public List<Address> fetchAddressAll(){
 		return addressService.fetchAddressAll();
 	}
}
