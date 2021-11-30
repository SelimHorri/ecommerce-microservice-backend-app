package com.selimhorri.app.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.selimhorri.app.dto.VerificationTokenDto;
import com.selimhorri.app.helper.VerificationTokenMappingHelper;
import com.selimhorri.app.repository.VerificationTokenRepository;
import com.selimhorri.app.service.VerificationTokenService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class VerificationTokenServiceImpl implements VerificationTokenService {
	
	private final VerificationTokenRepository verificationTokenRepository;
	
	@Override
	public List<VerificationTokenDto> findAll() {
		return this.verificationTokenRepository.findAll()
				.stream()
					.map(VerificationTokenMappingHelper::map)
					.distinct()
					.collect(Collectors.toUnmodifiableList());
	}
	
	@Override
	public VerificationTokenDto findById(final Integer verificationTokenId) {
		return this.verificationTokenRepository.findById(verificationTokenId)
				.map(VerificationTokenMappingHelper::map)
				.orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public VerificationTokenDto save(final VerificationTokenDto verificationTokenDto) {
		return VerificationTokenMappingHelper.map(this.verificationTokenRepository.save(VerificationTokenMappingHelper.map(verificationTokenDto)));
	}
	
	@Override
	public VerificationTokenDto update(final VerificationTokenDto verificationTokenDto) {
		return VerificationTokenMappingHelper.map(this.verificationTokenRepository.save(VerificationTokenMappingHelper.map(verificationTokenDto)));
	}
	
	@Override
	public VerificationTokenDto update(final Integer verificationTokenId, final VerificationTokenDto verificationTokenDto) {
		return VerificationTokenMappingHelper.map(this.verificationTokenRepository.save(
				VerificationTokenMappingHelper.map(this.findById(verificationTokenId))));
	}
	
	@Override
	public void deleteById(final Integer verificationTokenId) {
		this.verificationTokenRepository.deleteById(verificationTokenId);
	}
	
	
	
}










