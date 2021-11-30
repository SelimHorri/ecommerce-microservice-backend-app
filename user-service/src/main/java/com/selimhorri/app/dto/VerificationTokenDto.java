package com.selimhorri.app.dto;

import java.time.LocalDate;

import com.selimhorri.app.domain.Credential;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VerificationTokenDto {
	
	private Integer verificationTokenId;
	private String token;
	private LocalDate expireDate;
	private Credential credential;
	
}










