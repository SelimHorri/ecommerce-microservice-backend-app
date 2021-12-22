package com.selimhorri.app.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.selimhorri.app.domain.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer paymentId;
	private Boolean isPayed;
	private PaymentStatus paymentStatus;
	
	@JsonProperty("order")
	@JsonInclude(Include.NON_NULL)
	private OrderDto orderDto;
	
}










