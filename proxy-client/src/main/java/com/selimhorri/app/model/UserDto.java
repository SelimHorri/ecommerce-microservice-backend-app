package com.selimhorri.app.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
	
	private Integer userId;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String email;
	private String phone;
	
	@JsonInclude(value = Include.NON_NULL)
	private Set<AddressDto> addressDtos;
	
	@JsonInclude(value = Include.NON_NULL)
	private CredentialDto credentialDto;
	
}










