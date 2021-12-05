package com.selimhorri.app.exception.wrapper;

public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}










