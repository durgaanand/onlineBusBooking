package com.cg.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exceptions.InvalidUsernameException;

@ControllerAdvice
public class UserNameNotFoundException {
	@ExceptionHandler(InvalidUsernameException.class)
	public ResponseEntity<Object> exceptionHandlingMethod(InvalidUsernameException ex)
	{
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	

}
