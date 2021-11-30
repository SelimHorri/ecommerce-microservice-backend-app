package com.selimhorri.app.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.dto.VerificationTokenDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.VerificationTokenService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/api/verificationTokens"})
@Slf4j
@RequiredArgsConstructor
public class VerificationTokenResource {
	
	private final VerificationTokenService verificationTokenService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<VerificationTokenDto>> findAll() {
		log.info("*** VerificationTokenDto List, controller; fetch all verificationTokens *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.verificationTokenService.findAll()));
	}
	
	@GetMapping("/{verificationTokenId}")
	public ResponseEntity<VerificationTokenDto> findById(
			@PathVariable("verificationTokenId") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String verificationTokenId) {
		log.info("*** VerificationTokenDto, resource; fetch verificationToken by id *");
		return ResponseEntity.ok(this.verificationTokenService.findById(Integer.parseInt(verificationTokenId.strip())));
	}
	
	@PostMapping
	public ResponseEntity<VerificationTokenDto> save(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto) {
		log.info("*** VerificationTokenDto, resource; save verificationToken *");
		return ResponseEntity.ok(this.verificationTokenService.save(verificationTokenDto));
	}
	
	@PutMapping
	public ResponseEntity<VerificationTokenDto> update(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto) {
		log.info("*** VerificationTokenDto, resource; update verificationToken *");
		return ResponseEntity.ok(this.verificationTokenService.update(verificationTokenDto));
	}
	
	@PutMapping("/{verificationTokenId}")
	public ResponseEntity<VerificationTokenDto> update(
			@PathVariable("verificationTokenId") 
			@NotBlank(message = "*Input must not blank!**") final String verificationTokenId, 
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final VerificationTokenDto verificationTokenDto) {
		log.info("*** VerificationTokenDto, resource; update verificationToken with verificationTokenId *");
		return ResponseEntity.ok(this.verificationTokenService.update(Integer.parseInt(verificationTokenId.strip()), verificationTokenDto));
	}
	
	@DeleteMapping("/{verificationTokenId}")
	public ResponseEntity<Boolean> deleteById(
			@PathVariable("verificationTokenId") 
			@NotBlank(message = "*Input must not blank!**") final String verificationTokenId) {
		log.info("*** Boolean, resource; delete verificationToken by id *");
		this.verificationTokenService.deleteById(Integer.parseInt(verificationTokenId));
		return ResponseEntity.ok(true);
	}
	
	
	
}










