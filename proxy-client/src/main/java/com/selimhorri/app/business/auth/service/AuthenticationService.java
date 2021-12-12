package com.selimhorri.app.business.auth.service;

import com.selimhorri.app.business.auth.model.dto.request.AuthenticationRequest;
import com.selimhorri.app.business.auth.model.dto.response.AuthenticationResponse;

public interface AuthenticationService {
	
	AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
	Boolean authenticate(final String jwt);
	
}
