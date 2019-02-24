package com.springbootmicroservice.api.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(WordServiceBadRequestException.class)
	public ResponseEntity<ExceptionResponse> handleBadRequestException(
			WordServiceBadRequestException wordServiceBadRequestException, HttpServletRequest httpServletRequest) {

		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setRequestedUri(httpServletRequest.getRequestURI());
		exceptionResponse.setErrorMessage(wordServiceBadRequestException.getMessage());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

}
