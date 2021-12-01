package com.selimhorri.app.dto;

import java.io.Serializable;
import java.util.Set;

import com.selimhorri.app.domain.Role;
import com.selimhorri.app.domain.User;

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
	private Role role;
	private Boolean isEnabled;
	private Boolean isAccountNonExpired;
	private Boolean isAccountNonLocked;
	private Boolean isCredentialsNonExpired;
	private User user;
	private Set<VerificationTokenDto> verificationTokenDtos;
	
}










