package com.cg.exceptions;

public class UsernameAlreadyExistsException extends RuntimeException {

	public UsernameAlreadyExistsException() {
		super();
		
	}

	public UsernameAlreadyExistsException(String message) {
		super(message);
		
	}
	

}
