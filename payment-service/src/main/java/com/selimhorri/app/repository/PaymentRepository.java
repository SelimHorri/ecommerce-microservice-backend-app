package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	
	
}
