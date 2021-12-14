package com.selimhorri.app.business.payment.model.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.payment.model.PaymentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentPaymentServiceDtoCollectionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<PaymentDto> collection;
	
}
