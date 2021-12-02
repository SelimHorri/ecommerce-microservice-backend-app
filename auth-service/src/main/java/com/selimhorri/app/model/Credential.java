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
public class Credential {
	
	private Integer credentialId;
	private String username;
	private String password;
	private Role role;
	private Boolean isEnabled;
	private Boolean isAccountNonExpired;
	private Boolean isAccountNonLocked;
	private Boolean isCredentialsNonExpired;
	
	@JsonInclude(value = Include.NON_NULL)
	private User user;
	
	@JsonInclude(value = Include.NON_NULL)
	private Set<VerificationToken> verificationTokens;
	
}







