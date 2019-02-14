package com.Cultureguide.uulab.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdvise {

	@ExceptionHandler()
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void handle(HttpMessageNotReadableException e) {
		throw e;
	}

}
