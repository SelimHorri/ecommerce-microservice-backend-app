package com.selimhorri.app.business.order.model.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.order.model.OrderDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderOrderServiceDtoCollectionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<OrderDto> collection;
	
}
