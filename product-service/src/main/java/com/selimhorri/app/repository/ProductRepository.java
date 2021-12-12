package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
}
