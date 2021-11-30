package com.selimhorri.app.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {
	
	ROLE_USER("USER"),
	ROLE_ADMIN("ADMIN");
	
	private final String role;
	
}
