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

import com.selimhorri.app.dto.UserDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/api/users"})
@Slf4j
@RequiredArgsConstructor
public class UserResource {
	
	private final UserService userService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<UserDto>> findAll() {
		log.info("*** UserDto List, controller; fetch all users *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.userService.findAll()));
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> findById(
			@PathVariable("userId") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String userId) {
		log.info("*** UserDto, resource; fetch user by id *");
		return ResponseEntity.ok(this.userService.findById(Integer.parseInt(userId.strip())));
	}
	
	@PostMapping
	public ResponseEntity<UserDto> save(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final UserDto userDto) {
		log.info("*** UserDto, resource; save user *");
		return ResponseEntity.ok(this.userService.save(userDto));
	}
	
	@PutMapping
	public ResponseEntity<UserDto> update(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final UserDto userDto) {
		log.info("*** UserDto, resource; update user *");
		return ResponseEntity.ok(this.userService.update(userDto));
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> update(
			@PathVariable("userId") 
			@NotBlank(message = "*Input must not blank!**") final String userId, 
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final UserDto userDto) {
		log.info("*** UserDto, resource; update user with userId *");
		return ResponseEntity.ok(this.userService.update(Integer.parseInt(userId.strip()), userDto));
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("userId") @NotBlank(message = "*Input must not blank!**") @Valid final String userId) {
		log.info("*** Boolean, resource; delete user by id *");
		this.userService.deleteById(Integer.parseInt(userId));
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<UserDto> findByUsername(
			@PathVariable("username") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String username) {
		return ResponseEntity.ok(this.userService.findByUsername(username));
	}
	
	
	
}










