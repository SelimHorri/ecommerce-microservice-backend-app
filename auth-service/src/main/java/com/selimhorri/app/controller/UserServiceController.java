package com.selimhorri.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.selimhorri.app.constant.AppConstant;
import com.selimhorri.app.model.dto.response.UserServiceCollectionDtoResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserServiceController {
	
	private static final String API_URL = AppConstant.USER_SERVICE_HOST + "/api/users";
	private final RestTemplate restTemplate;
	
	@GetMapping
	public ResponseEntity<UserServiceCollectionDtoResponse> findAll() {
		return ResponseEntity.ok(this.restTemplate.getForObject(API_URL, UserServiceCollectionDtoResponse.class));
	}
	
	
	
}










