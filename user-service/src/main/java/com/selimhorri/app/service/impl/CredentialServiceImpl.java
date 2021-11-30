package com.selimhorri.app.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.selimhorri.app.dto.CredentialDto;
import com.selimhorri.app.helper.CredentialMappingHelper;
import com.selimhorri.app.repository.CredentialRepository;
import com.selimhorri.app.service.CredentialService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CredentialServiceImpl implements CredentialService {
	
	private final CredentialRepository credentialRepository;
	
	@Override
	public List<CredentialDto> findAll() {
		return this.credentialRepository.findAll()
				.stream()
					.map(CredentialMappingHelper::map)
					.distinct()
					.collect(Collectors.toUnmodifiableList());
	}
	
	@Override
	public CredentialDto findById(final Integer credentialId) {
		return this.credentialRepository.findById(credentialId)
				.map(CredentialMappingHelper::map)
				.orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public CredentialDto save(final CredentialDto credentialDto) {
		return CredentialMappingHelper.map(this.credentialRepository.save(CredentialMappingHelper.map(credentialDto)));
	}
	
	@Override
	public CredentialDto update(final CredentialDto credentialDto) {
		return CredentialMappingHelper.map(this.credentialRepository.save(CredentialMappingHelper.map(credentialDto)));
	}
	
	@Override
	public CredentialDto update(final Integer credentialId, final CredentialDto credentialDto) {
		return CredentialMappingHelper.map(this.credentialRepository.save(
				CredentialMappingHelper.map(this.findById(credentialId))));
	}
	
	@Override
	public void deleteById(final Integer credentialId) {
		this.credentialRepository.deleteById(credentialId);
	}
	
	
	
}










