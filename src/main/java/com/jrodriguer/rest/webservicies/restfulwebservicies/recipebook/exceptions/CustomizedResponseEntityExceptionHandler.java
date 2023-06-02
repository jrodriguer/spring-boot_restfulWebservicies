package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.ErrorResponse;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
    ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }  

  @ExceptionHandler(RecipeNotFoundException.class)
  public final ResponseEntity<Object> handleRecipeNotFoundException(Exception ex, WebRequest request) throws Exception {
    ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
  }  

}
