package com.selimhorri.app.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.selimhorri.app.constant.AppConstant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"cart"})
@Data
@Builder
public final class Order extends AbstractMappedEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false, updatable = false)
	private Integer orderId;
	
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT, shape = Shape.STRING)
	@DateTimeFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT)
	@Column(name = "order_date")
	private LocalDateTime orderDate;
	
	@Column(name = "order_desc")
	private String orderDesc;
	
	@Column(name = "order_fee", columnDefinition = "decimal")
	private Double orderFee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
}










