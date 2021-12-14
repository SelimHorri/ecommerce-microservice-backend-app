package com.selimhorri.app.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.dto.CategoryDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.CategoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/categories")
@Slf4j
@RequiredArgsConstructor
public class CategoryResource {
	
	private final CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<CategoryDto>> findAll() {
		log.info("*** CategoryDto List, controller; fetch all categories *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.categoryService.findAll()));
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> findById(
			@PathVariable("categoryId") 
			@NotBlank(message = "Input must not be blank") 
			@Valid final String categoryId) {
		log.info("*** CategoryDto, resource; fetch category by id *");
		return ResponseEntity.ok(this.categoryService.findById(Integer.parseInt(categoryId)));
	}
	
	@PostMapping
	public ResponseEntity<CategoryDto> save(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final CategoryDto categoryDto) {
		log.info("*** CategoryDto, resource; save category *");
		return ResponseEntity.ok(this.categoryService.save(categoryDto));
	}
	
	@PutMapping
	public ResponseEntity<CategoryDto> update(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final CategoryDto categoryDto) {
		log.info("*** CategoryDto, resource; update category *");
		return ResponseEntity.ok(this.categoryService.update(categoryDto));
	}
	
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> update(
			@PathVariable("categoryId")
			@NotBlank(message = "Input must not be blank")
			@Valid final String categoryId,
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final CategoryDto categoryDto) {
		log.info("*** CategoryDto, resource; update category with categoryId *");
		return ResponseEntity.ok(this.categoryService.update(Integer.parseInt(categoryId), categoryDto));
	}
	
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("categoryId") final String categoryId) {
		log.info("*** Boolean, resource; delete category by id *");
		this.categoryService.deleteById(Integer.parseInt(categoryId));
		return ResponseEntity.ok(true);
	}
	
	
	
}










