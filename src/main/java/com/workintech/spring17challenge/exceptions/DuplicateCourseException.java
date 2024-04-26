package com.workintech.spring17challenge.exceptions;

public class DuplicateCourseException extends RuntimeException {
    public DuplicateCourseException(String name) {
        super("Course with name: " + name + " already exists.");
    }
}
