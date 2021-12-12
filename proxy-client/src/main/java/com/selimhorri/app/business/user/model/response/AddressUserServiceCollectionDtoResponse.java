package com.selimhorri.app.business.user.model.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.user.model.AddressDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AddressUserServiceCollectionDtoResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<AddressDto> collection;
	
}
