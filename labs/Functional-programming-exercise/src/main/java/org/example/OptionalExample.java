package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> nonEmptyString = Optional.of("I am a non-empty String :)");
        Optional<String> emptyString = Optional.empty();
        Optional<String> nullString = Optional.ofNullable(null);


        nonEmptyString.ifPresent(value -> System.out.println("Value: " + value));
        emptyString.ifPresent(value -> System.out.println("Value: " + value));
        nullString.ifPresent(value -> System.out.println("Value: " + value));

        System.out.println(emptyString.orElse("I was Empty, so I return this message!"));

        System.out.println( nullString.orElseGet(() -> getFromDatabase()));

    }

    private static String getFromDatabase() {
        System.out.println("getFromDatabase called");
        return "value from DB";
    }
}
