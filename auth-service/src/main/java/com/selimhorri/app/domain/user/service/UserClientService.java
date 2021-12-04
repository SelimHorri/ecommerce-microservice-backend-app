package com.selimhorri.app.domain.user.service;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.selimhorri.app.model.UserDto;
import com.selimhorri.app.model.dto.response.UserServiceCollectionDtoResponse;

@FeignClient(name = "USER-SERVICE", path = "/user-service/api/users")
public interface UserClientService {
	
	@GetMapping
	ResponseEntity<UserServiceCollectionDtoResponse> findAll();
	
	@GetMapping("/{userId}")
	ResponseEntity<UserDto> findById(
			@PathVariable("userId") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String userId);
	
}










