package com.cg.exceptions;

public class InvalidUsernameException extends RuntimeException {
	String message;
	public InvalidUsernameException(String message)
	{
		this.message=message;
	}
	public InvalidUsernameException() {
	}
	@Override
	public String getMessage() {
		return message;
	}

	
	 
	
	
	

}
