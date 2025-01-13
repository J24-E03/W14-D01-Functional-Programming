import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.printf("%d + %d = %d\n", a, b, a + b);
        biConsumer.accept(10, 30);
    }
}
