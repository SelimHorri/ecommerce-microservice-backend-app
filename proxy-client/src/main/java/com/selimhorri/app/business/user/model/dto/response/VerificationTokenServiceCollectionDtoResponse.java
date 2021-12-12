package com.selimhorri.app.business.user.model.dto.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.user.model.VerificationTokenDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VerificationTokenServiceCollectionDtoResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<VerificationTokenDto> collection;
	
}
