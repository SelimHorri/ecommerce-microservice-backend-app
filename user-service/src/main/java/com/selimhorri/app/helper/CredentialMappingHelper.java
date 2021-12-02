package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Credential;
import com.selimhorri.app.domain.User;
import com.selimhorri.app.dto.CredentialDto;
import com.selimhorri.app.dto.UserDto;

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
				.userDto(
						UserDto.builder()
							.userId(credential.getUser().getUserId())
							.firstName(credential.getUser().getFirstName())
							.lastName(credential.getUser().getLastName())
							.imageUrl(credential.getUser().getImageUrl())
							.email(credential.getUser().getEmail())
							.phone(credential.getUser().getPhone())
							.build())
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
				.user(
						User.builder()
							.userId(credentialDto.getUserDto().getUserId())
							.firstName(credentialDto.getUserDto().getFirstName())
							.lastName(credentialDto.getUserDto().getLastName())
							.imageUrl(credentialDto.getUserDto().getImageUrl())
							.email(credentialDto.getUserDto().getEmail())
							.phone(credentialDto.getUserDto().getPhone())
							.build())
				// .verificationTokens(credentialDto.getVerificationTokenDtos())
				.build();
	}
	
	
	
}






