import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> notEmpty = Optional.of("Hello, World!");
        System.out.println(notEmpty);

        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);
    }
}
