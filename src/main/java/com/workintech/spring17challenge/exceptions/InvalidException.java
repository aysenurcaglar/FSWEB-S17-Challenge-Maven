package com.workintech.spring17challenge.exceptions;

public class InvalidException extends RuntimeException{

    public InvalidException() {
        super("Invalid Request. None of the values should be empty.");
    }
}
