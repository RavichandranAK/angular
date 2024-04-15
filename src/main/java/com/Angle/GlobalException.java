package com.Angle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value=AgeException.class)
	public ResponseEntity<Object> AgeExceptionHandler(AgeException ang){
		return new ResponseEntity<>(ang.getMessage(),HttpStatus.BAD_REQUEST);
	}
	

}
