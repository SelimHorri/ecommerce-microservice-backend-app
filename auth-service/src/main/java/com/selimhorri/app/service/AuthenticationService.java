package com.selimhorri.app.service;

import com.selimhorri.app.model.dto.request.AuthenticationRequest;
import com.selimhorri.app.model.dto.response.AuthenticationResponse;

public interface AuthenticationService {
	
	AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
	Boolean authenticate(final String jwt);
	
}
