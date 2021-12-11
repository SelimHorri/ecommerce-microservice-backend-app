package com.selimhorri.app.domain.auth.service;

import com.selimhorri.app.domain.auth.model.dto.request.AuthenticationRequest;
import com.selimhorri.app.domain.auth.model.dto.response.AuthenticationResponse;

public interface AuthenticationService {
	
	AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
	Boolean authenticate(final String jwt);
	
}
