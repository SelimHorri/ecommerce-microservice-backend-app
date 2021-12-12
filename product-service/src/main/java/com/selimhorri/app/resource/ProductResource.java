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

import com.selimhorri.app.dto.ProductDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/products")
@Slf4j
@RequiredArgsConstructor
public class ProductResource {
	
	private final ProductService productService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<ProductDto>> findAll() {
		log.info("*** ProductDto List, controller; fetch all categories *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.productService.findAll()));
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDto> findById(
			@PathVariable("productId") 
			@NotBlank(message = "Input must not be blank!") 
			@Valid final String productId) {
		log.info("*** ProductDto, resource; fetch product by id *");
		return ResponseEntity.ok(this.productService.findById(Integer.parseInt(productId)));
	}
	
	@PostMapping
	public ResponseEntity<ProductDto> save(
			@RequestBody 
			@NotNull(message = "Input must not be NULL!") 
			@Valid final ProductDto productDto) {
		log.info("*** ProductDto, resource; save product *");
		return ResponseEntity.ok(this.productService.save(productDto));
	}
	
	@PutMapping
	public ResponseEntity<ProductDto> update(
			@RequestBody 
			@NotNull(message = "Input must not be NULL!") 
			@Valid final ProductDto productDto) {
		log.info("*** ProductDto, resource; update product *");
		return ResponseEntity.ok(this.productService.update(productDto));
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<ProductDto> update(
			@PathVariable("productId")
			@NotBlank(message = "Input must not be blank!")
			@Valid final String productId,
			@RequestBody 
			@NotNull(message = "Input must not be NULL!") 
			@Valid final ProductDto productDto) {
		log.info("*** ProductDto, resource; update product with productId *");
		return ResponseEntity.ok(this.productService.update(Integer.parseInt(productId), productDto));
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("productId") final String productId) {
		log.info("*** Boolean, resource; delete product by id *");
		this.productService.deleteById(Integer.parseInt(productId));
		return ResponseEntity.ok(true);
	}
	
	
	
}










