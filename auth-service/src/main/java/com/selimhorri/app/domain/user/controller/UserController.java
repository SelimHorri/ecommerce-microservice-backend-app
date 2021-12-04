package com.selimhorri.app.domain.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.domain.user.service.UserClientService;
import com.selimhorri.app.model.UserDto;
import com.selimhorri.app.model.dto.response.UserServiceCollectionDtoResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserClientService userClientService;
	
	@GetMapping
	public ResponseEntity<UserServiceCollectionDtoResponse> findAll() {
		return ResponseEntity.ok(this.userClientService.findAll().getBody());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> findById(final String userId) {
		return ResponseEntity.ok(this.userClientService.findById(userId).getBody());
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<UserDto> findByUsername(final String username) {
		return ResponseEntity.ok(this.userClientService.findByUsername(username).getBody());
	}
	
	@PostMapping
	public ResponseEntity<UserDto> save(final UserDto userDto) {
		return ResponseEntity.ok(this.userClientService.save(userDto).getBody());
	}
	
	@PutMapping
	public ResponseEntity<UserDto> update(final UserDto userDto) {
		return ResponseEntity.ok(this.userClientService.update(userDto).getBody());
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Boolean> deleteById(final String userId) {
		return ResponseEntity.ok(this.userClientService.deleteById(userId).getBody());
	}
	
	
	
}










