package com.selimhorri.app.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.selimhorri.app.dto.UserDto;
import com.selimhorri.app.helper.UserMappingHelper;
import com.selimhorri.app.repository.UserRepository;
import com.selimhorri.app.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	@Override
	public List<UserDto> findAll() {
		return this.userRepository.findAll()
				.stream()
					.map(UserMappingHelper::map)
					.distinct()
					.collect(Collectors.toUnmodifiableList());
	}
	
	@Override
	public UserDto findById(final Integer userId) {
		return this.userRepository.findById(userId)
				.map(UserMappingHelper::map)
				.orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public UserDto save(final UserDto userDto) {
		return UserMappingHelper.map(this.userRepository.save(UserMappingHelper.map(userDto)));
	}
	
	@Override
	public UserDto update(final UserDto userDto) {
		return UserMappingHelper.map(this.userRepository.save(UserMappingHelper.map(userDto)));
	}
	
	@Override
	public UserDto update(final Integer userId, final UserDto userDto) {
		return UserMappingHelper.map(this.userRepository.save(
				UserMappingHelper.map(this.findById(userId))));
	}
	
	@Override
	public void deleteById(final Integer userId) {
		this.userRepository.deleteById(userId);
	}
	
	
	
}










