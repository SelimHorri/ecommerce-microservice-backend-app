package com.selimhorri.app.resource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.constant.AppConstant;
import com.selimhorri.app.domain.id.FavouriteId;
import com.selimhorri.app.dto.FavouriteDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.FavouriteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/favourites")
@Slf4j
@RequiredArgsConstructor
public class FavouriteResource {
	
	private final FavouriteService favouriteService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<FavouriteDto>> findAll() {
		log.info("*** FavouriteDto List, controller; fetch all favourites *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.favouriteService.findAll()));
	}
	
	@GetMapping("/{userId}/{productId}/{likeDate}")
	public ResponseEntity<FavouriteDto> findById(
			@PathVariable("userId") final String userId, 
			@PathVariable("productId") final String productId, 
			@PathVariable("likeDate") final String likeDate) {
		return ResponseEntity.ok(this.favouriteService.findById(
				new FavouriteId(Integer.parseInt(userId), Integer.parseInt(productId), 
						LocalDateTime.parse(likeDate, DateTimeFormatter.ofPattern(AppConstant.LOCAL_DATE_TIME_FORMAT)))));
	}
	
	@GetMapping("/find")
	public ResponseEntity<FavouriteDto> findById(@RequestBody final FavouriteId favouriteId) {
		return ResponseEntity.ok(this.favouriteService.findById(favouriteId));
	}
	
	
	
}










