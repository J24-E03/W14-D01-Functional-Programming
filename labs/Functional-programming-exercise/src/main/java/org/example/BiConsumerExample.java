package org.example;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> adderConsumer = (number1, number2) ->
                System.out.printf("%d plus %d is %d\n", number1, number2, number1 + number2);

        adderConsumer.accept(8,7);
    }
}
