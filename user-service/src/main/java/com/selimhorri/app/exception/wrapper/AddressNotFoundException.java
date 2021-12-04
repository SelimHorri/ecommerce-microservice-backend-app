package com.selimhorri.app.exception.wrapper;

public class AddressNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public AddressNotFoundException() {
		super();
	}
	
	public AddressNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AddressNotFoundException(String message) {
		super(message);
	}
	
	public AddressNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}
