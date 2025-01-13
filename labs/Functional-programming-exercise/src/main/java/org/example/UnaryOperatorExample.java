package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperator<Integer> multiplyWith2 = number -> number * 2;
        int num = 110;
        System.out.printf("%d multiplies with 2 is %d\n", num, multiplyWith2.apply(num));

    }
}
