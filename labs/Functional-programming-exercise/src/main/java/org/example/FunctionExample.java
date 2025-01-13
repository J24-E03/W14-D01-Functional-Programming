package org.example;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthCounter = string -> string.length();

        String text = "Hello, my name is Maryam.";
        System.out.printf("The length of \"%s\" is %d", text, lengthCounter.apply(text));
    }
}
