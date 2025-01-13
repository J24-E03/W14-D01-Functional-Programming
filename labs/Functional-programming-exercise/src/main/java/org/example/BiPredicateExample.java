package org.example;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isFirstNumberGreaterThanSecond =
                (number1 , number2) -> number1 > number2;

        int num1 = 19;
        int num2 = 8;
        System.out.printf("Is %d greater than %d? %b\n", num1, num2, isFirstNumberGreaterThanSecond.test(num1, num2));
        System.out.printf("Is %d greater than %d? %b\n", num2, num1, isFirstNumberGreaterThanSecond.test(num2, num1));
    }
}
