package com.selimhorri.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.selimhorri.app.domain.id.OrderItemId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_items")
@IdClass(OrderItemId.class)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public final class OrderItem extends AbstractMappedEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "product_id", nullable = false, updatable = false)
	private Integer productId;
	
	@Id
	@Column(name = "order_id", nullable = false, updatable = false)
	private Integer orderId;
	
	@Column(name = "ordered_quantity")
	private Integer orderedQuantity;
	
}










