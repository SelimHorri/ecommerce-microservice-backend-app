package com.selimhorri.app.domain.user.service;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.selimhorri.app.model.VerificationTokenDto;
import com.selimhorri.app.model.dto.response.VerificationTokenServiceCollectionDtoResponse;

@FeignClient(name = "USER-SERVICE", contextId = "verificationTokenClientService", path = "/user-service/api/verificationTokens", decode404 = true)
public interface VerificationTokenClientService {
	
	@GetMapping
	ResponseEntity<VerificationTokenServiceCollectionDtoResponse> findAll();
	
	@GetMapping("/{verificationTokenId}")
	ResponseEntity<VerificationTokenDto> findById(
			@PathVariable("verificationTokenId") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String verificationTokenId);
	
	@PostMapping
	ResponseEntity<VerificationTokenDto> save(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto);
	
	@PutMapping
	ResponseEntity<VerificationTokenDto> update(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto);
	
	@PutMapping("/{verificationTokenId}")
	ResponseEntity<VerificationTokenDto> update(
			@PathVariable("verificationTokenId") 
			@NotBlank(message = "*Input must not blank!**") final String verificationTokenId, 
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto);
	
	@DeleteMapping("/{verificationTokenId}")
	ResponseEntity<Boolean> deleteById(@PathVariable("verificationTokenId") @NotBlank(message = "*Input must not blank!**") @Valid final String verificationTokenId);
	
}










