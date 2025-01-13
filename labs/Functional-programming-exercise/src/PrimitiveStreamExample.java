import java.util.stream.Stream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
    }
}
