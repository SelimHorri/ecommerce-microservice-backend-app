package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Category;
import com.selimhorri.app.dto.CategoryDto;

public interface CategoryMappingHelper {
	
	public static CategoryDto map(final Category category) {
		return CategoryDto.builder()
				.categoryId(category.getCategoryId())
				.categoryTitle(category.getCategoryTitle())
				.imageUrl(category.getImageUrl())
				.parentCategoryDto(
						CategoryDto.builder()
							.categoryId(category.getParentCategory().getCategoryId())
							.categoryTitle(category.getParentCategory().getCategoryTitle())
							.imageUrl(category.getParentCategory().getImageUrl())
							.build())
				.build();
	}
	
	public static Category map(final CategoryDto categoryDto) {
		return Category.builder()
				.categoryId(categoryDto.getCategoryId())
				.categoryTitle(categoryDto.getCategoryTitle())
				.imageUrl(categoryDto.getImageUrl())
				.parentCategory(
						Category.builder()
							.categoryId(categoryDto.getParentCategoryDto().getCategoryId())
							.categoryTitle(categoryDto.getParentCategoryDto().getCategoryTitle())
							.imageUrl(categoryDto.getParentCategoryDto().getImageUrl())
							.build())
				.build();
	}
	
	
	
}










