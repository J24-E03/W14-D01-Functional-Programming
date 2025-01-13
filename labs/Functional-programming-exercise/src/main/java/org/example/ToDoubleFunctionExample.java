package org.example;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {

        // lambda expression for ToDoubleFunction FI for subtraction to get double value
        ToDoubleFunction<Double> compareTo15 = number1 -> number1 - 15.0;

        // testing for different numbers using above lambda expression
        double num1 = 25.5;
        double num2 = 10;
        double num3 = 15;

        System.out.println(compareTo15.applyAsDouble(num1) == 0 ? "Number is equal to 15.0" : "Number is different");
        System.out.println(compareTo15.applyAsDouble(num2) == 0 ? "Number is equal to 15.0" : "Number is different");
        System.out.println(compareTo15.applyAsDouble(num3) == 0 ? "Number is equal to 15.0" : "Number is different");




    }
}
