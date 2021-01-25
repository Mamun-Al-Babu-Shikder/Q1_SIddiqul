package com.safiqul;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ICT: derived class
 */
public class ICT extends Department {

    public ICT() {
    }

    public ICT(List<String> courses){
        courses = courses.stream().map(c->"ICT-".concat(c))
                .collect(Collectors.toList());
        super.courses = courses;
    }

    @Override
    public List<String> getCourses() {
        return super.getCourses();
    }
}
