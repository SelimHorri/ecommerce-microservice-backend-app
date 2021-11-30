package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
	
	
	
}
