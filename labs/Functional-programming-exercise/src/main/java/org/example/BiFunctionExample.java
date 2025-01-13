package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {

        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> adderFunction =
                (number1, number2) -> number1 + number2;

        int num1 = 110;
        int num2 = 340;
        System.out.printf("%d plus %d is equal to %d\n", num1, num2,
                adderFunction.apply(num1, num2));


        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> addAsList = (number1, number2) -> Arrays.asList(number1 + number2);
        System.out.println("Sum of " + num1 + " and " + num2 + " as List: " +  addAsList.apply(num1, num2));
    }
}
