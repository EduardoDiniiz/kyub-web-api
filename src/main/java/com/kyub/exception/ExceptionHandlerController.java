package com.kyub.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kyub.config.ConfigFile;

@ControllerAdvice
public class ExceptionHandlerController {

	@Autowired
	private ConfigFile config;

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandartError> pSQLException(DataIntegrityViolationException dataIntegrityViolationException,
			HttpServletRequest httpServletRequest) {
		StandartError standardError = new StandartError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(),
				dataIntegrityViolationException.getCause().getMessage(),
				dataIntegrityViolationException.getCause().getCause().getLocalizedMessage(),
				httpServletRequest.getRequestURI());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);

	}
}
