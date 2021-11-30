package com.selimhorri.app.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.selimhorri.app.constant.AppConstant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
abstract public class AbstractMappedEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@CreatedDate
	@JsonFormat(pattern = AppConstant.INSTANT_FORMAT, shape = Shape.STRING)
	@DateTimeFormat(pattern = AppConstant.INSTANT_FORMAT)
	@Column(name = "created_at")
	private ZonedDateTime createdAt;
	
	@LastModifiedDate
	@JsonFormat(pattern = AppConstant.INSTANT_FORMAT, shape = Shape.STRING)
	@DateTimeFormat(pattern = AppConstant.INSTANT_FORMAT)
	@Column(name = "updated_at")
	private ZonedDateTime updatedAt;
	
}










