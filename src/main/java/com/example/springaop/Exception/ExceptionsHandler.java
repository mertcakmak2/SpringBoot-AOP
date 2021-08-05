package com.example.springaop.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(value = { IllegalStateException.class })
    public ResponseEntity<?> handleInvalidInputException(IllegalStateException ex) {
        System.out.println("exception handler");
        return new ResponseEntity<>("ExceptionHandler Class: "+ex.getMessage(), HttpStatus.NOT_FOUND);
    }

}
