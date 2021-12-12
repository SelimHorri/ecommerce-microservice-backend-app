package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	
	
}
