package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrimitiveStreamExample {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(50, 65, 93, 100, 76, 88, 33, 45, 77, 96);

        double average = grades.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average of the grades: " + grades + " is: " + average);



    }
}
