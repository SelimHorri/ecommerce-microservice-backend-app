package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Credential;
import com.selimhorri.app.dto.CredentialDto;

public interface CredentialMappingHelper {
	
	public static CredentialDto map(final Credential credential) {
		return CredentialDto.builder()
				.credentialId(credential.getCredentialId())
				.username(credential.getUsername())
				.password(credential.getPassword())
				.role(credential.getRole())
				.isEnabled(credential.getIsEnabled())
				.isAccountNonExpired(credential.getIsAccountNonExpired())
				.isAccountNonLocked(credential.getIsAccountNonLocked())
				.isCredentialsNonExpired(credential.getIsCredentialsNonExpired())
				.user(credential.getUser())
				// .verificationTokens(credential.getVerificationTokenDtos())
				.build();
	}
	
	public static Credential map(final CredentialDto credentialDto) {
		return Credential.builder()
				.credentialId(credentialDto.getCredentialId())
				.username(credentialDto.getUsername())
				.password(credentialDto.getPassword())
				.role(credentialDto.getRole())
				.isEnabled(credentialDto.getIsEnabled())
				.isAccountNonExpired(credentialDto.getIsAccountNonExpired())
				.isAccountNonLocked(credentialDto.getIsAccountNonLocked())
				.isCredentialsNonExpired(credentialDto.getIsCredentialsNonExpired())
				.user(credentialDto.getUser())
				// .verificationTokens(credentialDto.getVerificationTokenDtos())
				.build();
	}
	
	
	
}






