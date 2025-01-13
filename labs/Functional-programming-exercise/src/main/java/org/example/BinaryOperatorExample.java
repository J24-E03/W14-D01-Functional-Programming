package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        int num1 = 110;
        int num2 = 220;

        // BiFunction
        BiFunction<Integer, Integer, Integer> adderFunction =
                (number1, number2) -> number1 + number2;
        System.out.printf("%d plus %d is %d\n", num1, num2, adderFunction.apply(num1, num2));


        // BinaryOperator
        BinaryOperator<Integer> adderOperator =
                (number1 , number2) -> number1 + number2;


        System.out.printf("%d plus %d is %d\n", num1, num2, adderOperator.apply(num1, num2));
    }

}
