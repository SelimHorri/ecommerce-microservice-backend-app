package com.selimhorri.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
	
	@JsonInclude(value = Include.NON_NULL)
	private CredentialDto credentialDto;
	
}










