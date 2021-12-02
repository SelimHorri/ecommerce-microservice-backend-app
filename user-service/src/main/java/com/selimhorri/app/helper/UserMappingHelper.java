package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Credential;
import com.selimhorri.app.domain.User;
import com.selimhorri.app.dto.CredentialDto;
import com.selimhorri.app.dto.UserDto;

public interface UserMappingHelper {
	
	public static UserDto map(final User user) {
		return UserDto.builder()
				.userId(user.getUserId())
				.firstName(user.getFirstName())
				.lastName(user.getLastName())
				.imageUrl(user.getImageUrl())
				.email(user.getEmail())
				.phone(user.getPhone())
				.credentialDto(
						CredentialDto.builder()
							.credentialId(user.getCredential().getCredentialId())
							.username(user.getCredential().getUsername())
							.password(user.getCredential().getPassword())
							.role(user.getCredential().getRole())
							.isEnabled(user.getCredential().getIsEnabled())
							.isAccountNonExpired(user.getCredential().getIsAccountNonExpired())
							.isAccountNonLocked(user.getCredential().getIsAccountNonLocked())
							.isCredentialsNonExpired(user.getCredential().getIsCredentialsNonExpired())
							.build())
				.build();
	}
	
	public static User map(final UserDto userDto) {
		return User.builder()
				.userId(userDto.getUserId())
				.firstName(userDto.getFirstName())
				.lastName(userDto.getLastName())
				.imageUrl(userDto.getImageUrl())
				.email(userDto.getEmail())
				.phone(userDto.getPhone())
				.credential(
						Credential.builder()
							.credentialId(userDto.getCredentialDto().getCredentialId())
							.username(userDto.getCredentialDto().getUsername())
							.password(userDto.getCredentialDto().getPassword())
							.role(userDto.getCredentialDto().getRole())
							.isEnabled(userDto.getCredentialDto().getIsEnabled())
							.isAccountNonExpired(userDto.getCredentialDto().getIsAccountNonExpired())
							.isAccountNonLocked(userDto.getCredentialDto().getIsAccountNonLocked())
							.isCredentialsNonExpired(userDto.getCredentialDto().getIsCredentialsNonExpired())
							.build())
				.build();
	}
	
	
	
}






