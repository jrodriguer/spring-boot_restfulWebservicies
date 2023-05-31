package com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.exceptions;
import com.jrodriguer.rest.webservicies.restfulwebservicies.recipebook.models.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    
  public ResourceNotFoundException(String message) {
    super(message);
  }

  public ErrorResponse getErrorResponse() {
    return new ErrorResponse(HttpStatus.NOT_FOUND.value(), "Resource not found", getMessage());
  }

}
