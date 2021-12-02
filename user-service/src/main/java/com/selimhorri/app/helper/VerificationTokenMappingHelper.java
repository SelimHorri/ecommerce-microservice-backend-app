package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Credential;
import com.selimhorri.app.domain.VerificationToken;
import com.selimhorri.app.dto.CredentialDto;
import com.selimhorri.app.dto.VerificationTokenDto;

public interface VerificationTokenMappingHelper {
	
	public static VerificationTokenDto map(final VerificationToken verificationToken) {
		return VerificationTokenDto.builder()
				.verificationTokenId(verificationToken.getVerificationTokenId())
				.token(verificationToken.getToken())
				.expireDate(verificationToken.getExpireDate())
				.credentialDto(
						CredentialDto.builder()
							.credentialId(verificationToken.getCredential().getCredentialId())
							.username(verificationToken.getCredential().getUsername())
							.password(verificationToken.getCredential().getPassword())
							.role(verificationToken.getCredential().getRole())
							.isEnabled(verificationToken.getCredential().getIsEnabled())
							.isAccountNonExpired(verificationToken.getCredential().getIsAccountNonExpired())
							.isAccountNonLocked(verificationToken.getCredential().getIsAccountNonLocked())
							.isCredentialsNonExpired(verificationToken.getCredential().getIsCredentialsNonExpired())
							.build())
				.build();
	}
	
	public static VerificationToken map(final VerificationTokenDto verificationTokenDto) {
		return VerificationToken.builder()
				.verificationTokenId(verificationTokenDto.getVerificationTokenId())
				.token(verificationTokenDto.getToken())
				.expireDate(verificationTokenDto.getExpireDate())
				.credential(
						Credential.builder()
							.credentialId(verificationTokenDto.getCredentialDto().getCredentialId())
							.username(verificationTokenDto.getCredentialDto().getUsername())
							.password(verificationTokenDto.getCredentialDto().getPassword())
							.role(verificationTokenDto.getCredentialDto().getRole())
							.isEnabled(verificationTokenDto.getCredentialDto().getIsEnabled())
							.isAccountNonExpired(verificationTokenDto.getCredentialDto().getIsAccountNonExpired())
							.isAccountNonLocked(verificationTokenDto.getCredentialDto().getIsAccountNonLocked())
							.isCredentialsNonExpired(verificationTokenDto.getCredentialDto().getIsCredentialsNonExpired())
							.build())
				.build();
	}
	
	
	
}






