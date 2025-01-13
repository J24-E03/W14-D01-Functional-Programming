import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // BiFunction
        BiFunction<Integer, Integer, Integer> number = (a, b) -> a + b;
        System.out.println(number.apply(5, 7)); // 12

        // BinaryOperator
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 7)); // 12
    }

}
