package com.selimhorri.app.config.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthenticationRequestFilter extends OncePerRequestFilter {
	
	private static final String API_URL = "http://AUTH-SERVICE/auth-service/api/authenticate";
	private final RestTemplate restTemplate;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final var authorizationHeader = request.getHeader("Authorization");
		
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			final var jwt = authorizationHeader.substring(7);
			if (this.restTemplate.getForObject(API_URL + "/jwt/" + jwt, Boolean.class))
				filterChain.doFilter(request, response);
			
		}
		
	}
	
	
	
}










