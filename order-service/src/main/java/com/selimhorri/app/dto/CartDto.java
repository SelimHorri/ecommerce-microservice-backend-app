package com.selimhorri.app.dto;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.selimhorri.app.domain.Order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CartDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer cartId;
	
	@JsonInclude(Include.NON_NULL)
	private Set<Order> orders;
	
	@JsonInclude(Include.NON_NULL)
	private UserDto userDto;
	
}










