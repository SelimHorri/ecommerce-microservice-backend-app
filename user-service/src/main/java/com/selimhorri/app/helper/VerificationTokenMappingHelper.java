package com.selimhorri.app.helper;

import com.selimhorri.app.domain.VerificationToken;
import com.selimhorri.app.dto.VerificationTokenDto;

public interface VerificationTokenMappingHelper {
	
	public static VerificationTokenDto map(final VerificationToken verificationToken) {
		return VerificationTokenDto.builder()
				.verificationTokenId(verificationToken.getVerificationTokenId())
				.token(verificationToken.getToken())
				.expireDate(verificationToken.getExpireDate())
				.credential(verificationToken.getCredential())
				.build();
	}
	
	public static VerificationToken map(final VerificationTokenDto verificationTokenDto) {
		return VerificationToken.builder()
				.verificationTokenId(verificationTokenDto.getVerificationTokenId())
				.token(verificationTokenDto.getToken())
				.expireDate(verificationTokenDto.getExpireDate())
				.credential(verificationTokenDto.getCredential())
				.build();
	}
	
	
	
}






