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

import com.selimhorri.app.dto.AddressDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.AddressService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/api/address"})
@Slf4j
@RequiredArgsConstructor
public class AddressResource {
	
	private final AddressService addressService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<AddressDto>> findAll() {
		log.info("*** AddressDto List, controller; fetch all addresss *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.addressService.findAll()));
	}
	
	@GetMapping("/{addressId}")
	public ResponseEntity<AddressDto> findById(
			@PathVariable("addressId") 
			@NotBlank(message = "*Input must not blank!**") 
			@Valid final String addressId) {
		log.info("*** AddressDto, resource; fetch address by id *");
		return ResponseEntity.ok(this.addressService.findById(Integer.parseInt(addressId.strip())));
	}
	
	@PostMapping
	public ResponseEntity<AddressDto> save(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final AddressDto addressDto) {
		log.info("*** AddressDto, resource; save address *");
		return ResponseEntity.ok(this.addressService.save(addressDto));
	}
	
	@PutMapping
	public ResponseEntity<AddressDto> update(
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final AddressDto addressDto) {
		log.info("*** AddressDto, resource; update address *");
		return ResponseEntity.ok(this.addressService.update(addressDto));
	}
	
	@PutMapping("/{addressId}")
	public ResponseEntity<AddressDto> update(
			@PathVariable("addressId") 
			@NotBlank(message = "*Input must not blank!**") final String addressId, 
			@RequestBody 
			@NotNull(message = "*Input must not NULL!**") 
			@Valid final AddressDto addressDto) {
		log.info("*** AddressDto, resource; update address with addressId *");
		return ResponseEntity.ok(this.addressService.update(Integer.parseInt(addressId.strip()), addressDto));
	}
	
	@DeleteMapping("/{addressId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("addressId") @NotBlank(message = "*Input must not blank!**") @Valid final String addressId) {
		log.info("*** Boolean, resource; delete address by id *");
		this.addressService.deleteById(Integer.parseInt(addressId));
		return ResponseEntity.ok(true);
	}
	
	
	
}










