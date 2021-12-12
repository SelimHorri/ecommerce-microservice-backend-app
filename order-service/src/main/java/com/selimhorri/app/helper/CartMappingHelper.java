package com.selimhorri.app.helper;

import com.selimhorri.app.domain.Cart;
import com.selimhorri.app.dto.CartDto;
import com.selimhorri.app.dto.UserDto;

public interface CartMappingHelper {
	
	public static CartDto map(final Cart cart) {
		return CartDto.builder()
				.cartId(cart.getCartId())
				.userDto(
						UserDto.builder()
							.build())
				.build();
	}
	
	public static Cart map(final CartDto cartDto) {
		return Cart.builder()
				.cartId(cartDto.getCartId())
				.build();
	}
	
	
	
}










