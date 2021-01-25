package com.safiqul;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * CSE: derived class
 */
public class CSE extends Department {
    public CSE() {
    }

    public CSE(List<String> courses){
        courses = courses.stream().map(c->"CSE-".concat(c))
                .collect(Collectors.toList());
        super.courses = courses;
    }

    @Override
    public List<String> getCourses() {
        return super.getCourses();
    }
}
