package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Credential;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {
	
	
	
}
