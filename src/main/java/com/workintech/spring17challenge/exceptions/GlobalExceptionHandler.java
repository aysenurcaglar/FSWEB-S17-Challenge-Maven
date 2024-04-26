package com.workintech.spring17challenge.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleCourseNotFoundException(CourseNotFoundException e) {
        ApiErrorResponse apiResponseError = new ApiErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        log.error(e.getMessage());
        return new ResponseEntity<>(apiResponseError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateCourseException.class)
    public ResponseEntity<ApiErrorResponse> handleDuplicateCourseException(DuplicateCourseException e) {
        ApiErrorResponse apiResponseError = new ApiErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
        log.error(e.getMessage());
        return new ResponseEntity<>(apiResponseError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidException.class)
    public ResponseEntity<ApiErrorResponse> handleInvalidCreditException(InvalidException e) {
        ApiErrorResponse apiResponseError = new ApiErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
        log.error(e.getMessage());
        return new ResponseEntity<>(apiResponseError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handleGeneralException(Exception e) {
        ApiErrorResponse apiResponseError = new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "An unexpected error occurred.", System.currentTimeMillis());
        log.error("General Exception:", e);
        return new ResponseEntity<>(apiResponseError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
