package com.selimhorri.app.dto;

import java.io.Serializable;

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
public class OrderItemDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer productId;
	private Integer orderId;
	private Integer orderedQuantity;
	
	@JsonInclude(Include.NON_NULL)
	private ProductDto productDto;
	
	@JsonInclude(Include.NON_NULL)
	private OrderDto orderDto;
	
}










