import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        IntStream
            .range(1, 11)
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println)
        ;
    }
}
