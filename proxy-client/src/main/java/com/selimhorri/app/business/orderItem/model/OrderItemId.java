package com.selimhorri.app.business.orderItem.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItemId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private Integer orderId;
	
}











