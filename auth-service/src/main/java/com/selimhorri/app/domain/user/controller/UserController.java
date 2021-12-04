package com.selimhorri.app.domain.user.controller;

import javax.validation.constraints.NotBlank;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.selimhorri.app.constant.AppConstant;
import com.selimhorri.app.domain.user.service.UserClientService;
import com.selimhorri.app.model.UserDto;
import com.selimhorri.app.model.dto.response.UserServiceCollectionDtoResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private static final String API_URL = AppConstant.USER_SERVICE_HOST + "/api/users";
	private final RestTemplate restTemplate;
	private final UserClientService userClientService;
	
	@GetMapping
	public ResponseEntity<UserServiceCollectionDtoResponse> findAll() {
		return ResponseEntity.ok(this.userClientService.findAll().getBody());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> findById(@PathVariable("userId") @NotBlank final String userId) {
		return ResponseEntity.ok(this.userClientService.findById(userId).getBody());
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<UserDto> findByUsername(@PathVariable("username") @NotBlank final String username) {
		return ResponseEntity.ok(this.restTemplate.getForObject(API_URL + "/username/" + username, UserDto.class));
	}
	
	@PostMapping
	public ResponseEntity<UserDto> save(@RequestBody final UserDto userDto) {
		return ResponseEntity.ok(this.restTemplate.postForObject(API_URL, userDto, UserDto.class));
	}
	
	@PutMapping
	public ResponseEntity<UserDto> update(@RequestBody final UserDto userDto) {
		return ResponseEntity.ok(this.restTemplate
				.exchange(API_URL, 
						HttpMethod.PUT, 
						new HttpEntity<>(userDto), 
						UserDto.class)
				.getBody());
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("userId") @NotBlank final String userId) {
		return ResponseEntity.ok(this.restTemplate
				.exchange(API_URL, 
						HttpMethod.DELETE, 
						null, 
						Boolean.class)
				.getBody());
	}
	
	
	
}










