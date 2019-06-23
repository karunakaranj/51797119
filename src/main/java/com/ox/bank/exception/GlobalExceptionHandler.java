package com.ox.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorResponse> dataNotFoundExceptionHandler(Exception ex){
		ErrorResponse errorRespose=new ErrorResponse();
		errorRespose.setErrorMessage(ex.getMessage());
		return new ResponseEntity<>(errorRespose, HttpStatus.NOT_FOUND);
		
	}
}
