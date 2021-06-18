package com.springapi.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    
	@ExceptionHandler
	public ResponseEntity<String> NoSuchException(NoSuchElementException nosuch)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No Such Employee Found");
	}
}
