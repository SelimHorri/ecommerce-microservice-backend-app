package com.selimhorri.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.selimhorri.app.dto.CategoryDto;
import com.selimhorri.app.exception.wrapper.CategoryNotFoundException;
import com.selimhorri.app.helper.CategoryMappingHelper;
import com.selimhorri.app.repository.CategoryRepository;
import com.selimhorri.app.service.CategoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	@Override
	public List<CategoryDto> findAll() {
		log.info("*** CategoryDto List, service; fetch all categorys *");
		return this.categoryRepository.findAll()
				.stream()
					.map(CategoryMappingHelper::map)
					.distinct()
					.collect(Collectors.toUnmodifiableList());
	}
	
	@Override
	public CategoryDto findById(final Integer categoryId) {
		log.info("*** CategoryDto, service; fetch category by id *");
		return this.categoryRepository.findById(categoryId)
				.map(CategoryMappingHelper::map)
				.orElseThrow(() -> new CategoryNotFoundException(String.format("Category with id: %d not found", categoryId)));
	}
	
	@Override
	public CategoryDto save(final CategoryDto categoryDto) {
		log.info("*** CategoryDto, service; save category *");
		return CategoryMappingHelper.map(this.categoryRepository
				.save(CategoryMappingHelper.map(categoryDto)));
	}
	
	@Override
	public CategoryDto update(final CategoryDto categoryDto) {
		log.info("*** CategoryDto, service; update category *");
		return CategoryMappingHelper.map(this.categoryRepository
				.save(CategoryMappingHelper.map(categoryDto)));
	}
	
	@Override
	public CategoryDto update(final Integer categoryId, final CategoryDto categoryDto) {
		log.info("*** CategoryDto, service; update category with categoryId *");
		return CategoryMappingHelper.map(this.categoryRepository
				.save(CategoryMappingHelper.map(this.findById(categoryId))));
	}
	
	@Override
	public void deleteById(final Integer categoryId) {
		log.info("*** Void, service; delete category by id *");
		this.categoryRepository.deleteById(categoryId);
	}
	
	
	
}









