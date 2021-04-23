package com.cg.exceptions;

public class InvalidUsernameException extends Exception {
	String message;
	public InvalidUsernameException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}

	
	 
	
	
	

}
