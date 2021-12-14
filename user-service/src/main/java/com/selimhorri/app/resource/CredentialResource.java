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

import com.selimhorri.app.dto.CredentialDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.CredentialService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/api/credentials"})
@Slf4j
@RequiredArgsConstructor
public class CredentialResource {
	
	private final CredentialService credentialService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<CredentialDto>> findAll() {
		log.info("*** CredentialDto List, controller; fetch all credentials *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.credentialService.findAll()));
	}
	
	@GetMapping("/{credentialId}")
	public ResponseEntity<CredentialDto> findById(
			@PathVariable("credentialId") 
			@NotBlank(message = "Input must not blank") 
			@Valid final String credentialId) {
		log.info("*** CredentialDto, resource; fetch credential by id *");
		return ResponseEntity.ok(this.credentialService.findById(Integer.parseInt(credentialId.strip())));
	}
	
	@PostMapping
	public ResponseEntity<CredentialDto> save(
			@RequestBody 
			@NotNull(message = "Input must not NULL") 
			@Valid final CredentialDto credentialDto) {
		log.info("*** CredentialDto, resource; save credential *");
		return ResponseEntity.ok(this.credentialService.save(credentialDto));
	}
	
	@PutMapping
	public ResponseEntity<CredentialDto> update(
			@RequestBody 
			@NotNull(message = "Input must not NULL") 
			@Valid final CredentialDto credentialDto) {
		log.info("*** CredentialDto, resource; update credential *");
		return ResponseEntity.ok(this.credentialService.update(credentialDto));
	}
	
	@PutMapping("/{credentialId}")
	public ResponseEntity<CredentialDto> update(
			@PathVariable("credentialId") 
			@NotBlank(message = "Input must not blank") final String credentialId, 
			@RequestBody 
			@NotNull(message = "Input must not NULL") 
			@Valid final CredentialDto credentialDto) {
		log.info("*** CredentialDto, resource; update credential with credentialId *");
		return ResponseEntity.ok(this.credentialService.update(Integer.parseInt(credentialId.strip()), credentialDto));
	}
	
	@DeleteMapping("/{credentialId}")
	public ResponseEntity<Boolean> deleteById(
			@PathVariable("credentialId") 
			@NotBlank(message = "Input must not blank") 
			@Valid final String credentialId) {
		log.info("*** Boolean, resource; delete credential by id *");
		this.credentialService.deleteById(Integer.parseInt(credentialId));
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<CredentialDto> findByUsername(
			@PathVariable("username") 
			@NotBlank(message = "Input must not blank") 
			@Valid final String username) {
		log.info("*** CredentialDto, resource; update credential with credentialId *");
		return ResponseEntity.ok(this.credentialService.findByUsername(username));
	}
	
	
	
}










