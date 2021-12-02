package com.selimhorri.app.model.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticationRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
}










