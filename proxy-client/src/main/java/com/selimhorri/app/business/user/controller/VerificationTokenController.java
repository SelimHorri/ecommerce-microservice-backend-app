package com.selimhorri.app.business.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.business.user.model.VerificationTokenDto;
import com.selimhorri.app.business.user.model.dto.response.VerificationTokenServiceCollectionDtoResponse;
import com.selimhorri.app.business.user.service.VerificationTokenClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/verificationTokens")
@RequiredArgsConstructor
public class VerificationTokenController {
	
	private final VerificationTokenClientService verificationTokenClientService;
	
	@GetMapping
	public ResponseEntity<VerificationTokenServiceCollectionDtoResponse> findAll() {
		return ResponseEntity.ok(this.verificationTokenClientService.findAll().getBody());
	}
	
	@GetMapping("/{verificationTokenId}")
	public ResponseEntity<VerificationTokenDto> findById(@PathVariable("verificationTokenId") final String verificationTokenId) {
		return ResponseEntity.ok(this.verificationTokenClientService.findById(verificationTokenId).getBody());
	}
	
	@PostMapping
	public ResponseEntity<VerificationTokenDto> save(@RequestBody final VerificationTokenDto verificationTokenDto) {
		return ResponseEntity.ok(this.verificationTokenClientService.save(verificationTokenDto).getBody());
	}
	
	@PutMapping
	public ResponseEntity<VerificationTokenDto> update(@RequestBody final VerificationTokenDto verificationTokenDto) {
		return ResponseEntity.ok(this.verificationTokenClientService.update(verificationTokenDto).getBody());
	}
	
	@PutMapping("/{verificationTokenId}")
	public ResponseEntity<VerificationTokenDto> update(@PathVariable("verificationTokenId") final String verificationTokenId, @RequestBody final VerificationTokenDto verificationTokenDto) {
		return ResponseEntity.ok(this.verificationTokenClientService.update(verificationTokenDto).getBody());
	}
	
	@DeleteMapping("/{verificationTokenId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("verificationTokenId") final String verificationTokenId) {
		return ResponseEntity.ok(this.verificationTokenClientService.deleteById(verificationTokenId).getBody());
	}
	
	
	
}










