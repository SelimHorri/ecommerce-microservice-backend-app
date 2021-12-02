package com.selimhorri.app.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(null));
	}
	
	@Override
	public String getUsername() {
		return null;
	}
	
	@Override
	public String getPassword() {
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		return false;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	
	
	
}










