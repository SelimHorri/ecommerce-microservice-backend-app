package com.selimhorri.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Credential;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {
	
	Optional<Credential> findByUsername(final String username);
	
}
