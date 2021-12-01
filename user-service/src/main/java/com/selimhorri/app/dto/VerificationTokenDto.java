package com.selimhorri.app.dto;

import java.io.Serializable;
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
public class VerificationTokenDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer verificationTokenId;
	private String token;
	private LocalDate expireDate;
	private Credential credential;
	
}










