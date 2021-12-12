package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
	
}
