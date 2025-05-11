package com.project.Flight_Management_System.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Flight_Management_System.dto.Payment;
import com.project.Flight_Management_System.repo.PaymentRepo;

@Repository
public class PaymentDao {
	
	@Autowired
	PaymentRepo paymentRepo;
	
	public Payment savePayment(Payment payment) {
		return  paymentRepo.save(payment);
	}
	public Payment fetchPaymentById(int paymentId) {
		return paymentRepo.findById(paymentId).get();
	}
	public Payment deletePaymentById(int paymentId) {
		Payment payment=fetchPaymentById(paymentId);
		paymentRepo.delete(payment);
		return payment;
	}
	public Payment updatePaymentById(int oldPaymentId,Payment newPayment) {
		newPayment.setPaymentId(oldPaymentId);
		return paymentRepo.save(newPayment);
	}
	public List<Payment> fetchPaymentAll(){
		return paymentRepo.findAll();
	}

}
