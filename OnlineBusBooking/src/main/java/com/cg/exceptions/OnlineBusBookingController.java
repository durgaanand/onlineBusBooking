package com.cg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OnlineBusBookingController  {
	@ExceptionHandler(value = UsernameAlreadyExistsException.class)
	public ResponseEntity<Object> handleException(UsernameAlreadyExistsException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.CONFLICT);
	}
	@ExceptionHandler(value = InvalidUsernameException.class)
	public ResponseEntity<Object> handleException(InvalidUsernameException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = UsernameNotFoundException.class)
	public ResponseEntity<Object> handleException(UsernameNotFoundException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = UserValidationException.class)
	public ResponseEntity<Object> handleException(UserValidationException exception) {
		return new ResponseEntity<>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<Object> handleException(InvalidUserException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	
}