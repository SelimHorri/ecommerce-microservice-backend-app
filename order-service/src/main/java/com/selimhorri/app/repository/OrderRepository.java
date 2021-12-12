package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	
	
}
