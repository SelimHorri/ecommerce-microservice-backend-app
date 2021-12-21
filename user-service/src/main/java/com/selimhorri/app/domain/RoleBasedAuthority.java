package com.selimhorri.app.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RoleBasedAuthority {
	
	ROLE_USER("USER"),
	ROLE_ADMIN("ADMIN");
	
	private final String role;
	
}
