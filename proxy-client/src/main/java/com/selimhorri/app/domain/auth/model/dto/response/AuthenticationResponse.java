package com.selimhorri.app.domain.auth.model.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticationResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String jwtToken;
	
}










