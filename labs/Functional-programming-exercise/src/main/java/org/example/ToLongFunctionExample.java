package org.example;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {

        // Lambda expression to multiply a number with 1024 using ToLongFunction FI
        ToLongFunction<Long> multiplyBy1024 = number -> number * 1024;

        long num1 = 2;
        long num2 = 5;
        long num3 = 10;

        // Multiply the numbers using the above ToLongFunction FI and print the results
        System.out.println("Result of multiplying " + num1 + " with 1024: " + multiplyBy1024.applyAsLong(num1));
        System.out.println("Result of multiplying " + num2 + " with 1024: " + multiplyBy1024.applyAsLong(num2));
        System.out.println("Result of multiplying " + num3 + " with 1024: " + multiplyBy1024.applyAsLong(num3));

    }
}
