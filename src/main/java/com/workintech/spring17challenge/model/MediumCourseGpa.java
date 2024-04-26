package com.workintech.spring17challenge.model;

import org.springframework.stereotype.Component;

@Component
public class MediumCourseGpa implements CourseGpa {
    @Override
    public Integer getGpa() {
        return 5;
    }
}
