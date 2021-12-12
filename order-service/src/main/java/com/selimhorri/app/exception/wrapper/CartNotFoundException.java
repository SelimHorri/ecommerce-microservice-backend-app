package com.selimhorri.app.exception.wrapper;

public class CartNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public CartNotFoundException() {
		super();
	}
	
	public CartNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CartNotFoundException(String message) {
		super(message);
	}
	
	public CartNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}











