package com.project.Flight_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Flight_Management_System.dao.AddressDao;
import com.project.Flight_Management_System.dto.Address;

@Service
public class AddressService {
	@Autowired
	AddressDao addressDao;
	
	public Address saveAddress(Address address) {
		return addressDao.saveAddress(address);
	}
	public Address fetchAddressById(int addressId) {
		return addressDao.fetchAddressById(addressId);
	}
	public Address deleteAddressById(int addressId) {
		
		return addressDao.deleteAddressById(addressId);
	}
	public Address updateAddressById(int oldAddressId, Address newaAddress) {
		return addressDao.updateAddressById(oldAddressId, newaAddress);
	}
	public List<Address> fetchAddressAll(){
		return addressDao.fetchAddressAll();
	}

}
