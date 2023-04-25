/* =========================
 @Author : Er.Prasad B.Badwar.
 @Date : 21/04/2023
 @Description : This class is created for handling Global Exceptions.
*===========================*/
package com.hdfc.ems.client.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<String> handleBookExp(HttpClientErrorException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
