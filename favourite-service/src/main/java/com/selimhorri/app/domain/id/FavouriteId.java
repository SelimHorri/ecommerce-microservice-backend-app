package com.selimhorri.app.domain.id;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FavouriteId {
	
	private Integer userId;
	private Integer productId;
	private LocalDateTime likeDate;
	
}










