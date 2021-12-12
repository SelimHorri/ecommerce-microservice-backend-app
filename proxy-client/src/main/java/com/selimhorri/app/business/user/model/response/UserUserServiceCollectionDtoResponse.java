package com.selimhorri.app.business.user.model.response;

import java.io.Serializable;
import java.util.Collection;

import com.selimhorri.app.business.user.model.UserDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserUserServiceCollectionDtoResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Collection<UserDto> collection;
	
}
