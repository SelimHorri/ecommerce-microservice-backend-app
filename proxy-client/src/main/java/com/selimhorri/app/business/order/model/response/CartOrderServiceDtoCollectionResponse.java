package com.selimhorri.app.business.order.model.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.order.model.CartDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CartOrderServiceDtoCollectionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<CartDto> collection;
	
}
