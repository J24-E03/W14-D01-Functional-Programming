package org.example;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {

        // Lambda expression to find the square of a number using ToIntFunction FI
        ToIntFunction<Integer> squareFunction = number -> number * number;

        int num1 = 5;
        int num2 = 10;
        int num3 = 7;

        // Computing and printing the square of integers
        System.out.println("Square of " + num1 + " is: " + squareFunction.applyAsInt(num1));
        System.out.println("Square of " + num2 + " is: " + squareFunction.applyAsInt(num2));
        System.out.println("Square of " + num3 + " is: " + squareFunction.applyAsInt(num3));

    }
}
