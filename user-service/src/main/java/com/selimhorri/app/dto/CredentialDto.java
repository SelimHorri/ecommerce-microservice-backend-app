package com.selimhorri.app.dto;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.selimhorri.app.domain.RoleBasedAuthority;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CredentialDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer credentialId;
	
	private String username;
	
	private String password;
	
	private RoleBasedAuthority roleBasedAuthority;
	
	private Boolean isEnabled;
	
	private Boolean isAccountNonExpired;
	
	private Boolean isAccountNonLocked;
	
	private Boolean isCredentialsNonExpired;
	
	@JsonProperty("user")
	@JsonInclude(value = Include.NON_NULL)
	private UserDto userDto;
	
	@JsonInclude(value = Include.NON_NULL)
	private Set<VerificationTokenDto> verificationTokenDtos;
	
}










