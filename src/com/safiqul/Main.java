package com.safiqul;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Object for derived classes
         */
        ICT ict = new ICT(Arrays.asList("IT-Security", "Networking", "Web Development"));
        CSE cse = new CSE(Arrays.asList("C programming", "Java programming", "Python programming", "AI"));

        /**
         * Array of classes
         */
        Object[] objects = new Object[2];
        objects[0] = ict;
        objects[1] = cse;

        /**
         * Print courses through 'printCourses' according to dynamic polymorphism.
         */
        System.out.println("Print Courses:");
        Arrays.stream(objects)
                .forEach(obj->Main.printCourses((Department) obj));
    }

    /**
     * Concept of dynamic polymorphism.
     */
    private static void printCourses(Department department){
        List<String> list = department.getCourses();
        list.forEach(System.out::println);
    }
}
