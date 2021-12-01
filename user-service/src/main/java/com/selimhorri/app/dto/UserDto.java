package com.selimhorri.app.dto;

import java.io.Serializable;

import com.selimhorri.app.domain.Credential;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String email;
	private String phone;
	private Credential credential;
	
}










