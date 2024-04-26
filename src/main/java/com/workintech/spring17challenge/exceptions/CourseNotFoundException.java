package com.workintech.spring17challenge.exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(Integer id) {
        super("Course not found with id: " + id);
    }

    public CourseNotFoundException(String name) {
        super("Course not found with name: " + name);
    }
}
