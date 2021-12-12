package com.selimhorri.app.exception.wrapper;

public class OrderNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public OrderNotFoundException() {
		super();
	}
	
	public OrderNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public OrderNotFoundException(String message) {
		super(message);
	}
	
	public OrderNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}











