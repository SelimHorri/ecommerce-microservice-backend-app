package com.selimhorri.app.model.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthenticationRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "*Username must not be empty!**")
	private String username;
	
	@NotNull(message = "*Password must not be null!**")
	private String password;
	
}










