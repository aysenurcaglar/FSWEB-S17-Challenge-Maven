package com.workintech.spring17challenge.validation;

import com.workintech.spring17challenge.exceptions.InvalidException;

public class CourseValidation {
    public static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidException();
        }
    }

    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new InvalidException();
        }
    }

    public static void checkId(Integer id) {
        if (id == null || id < 0) {
            throw new InvalidException();
        }
    }
}
