package com.selimhorri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.app.domain.Favourite;
import com.selimhorri.app.domain.id.FavouriteId;

public interface FavouriteRepository extends JpaRepository<Favourite, FavouriteId> {
	
	
	
}
