package edu.devember.NBA.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// The@ControllerAdvice annotation allows us to consolidate our multiple,
// scattered @ExceptionHandlers from before into a single, global error handling component.
@ControllerAdvice
public class EntityRestExceptionHandler {

    // Add an EntityNotFoundException handler
    // ResponseEntity represents the whole HTTP response: status code, headers, and body
    @ExceptionHandler
    public ResponseEntity<EntityErrorResponse> handleException(EntityNotFoundException exc) {

        EntityErrorResponse error = new EntityErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add an exception handler ... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<EntityErrorResponse> handleException(Exception exc) {

        EntityErrorResponse error = new EntityErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
