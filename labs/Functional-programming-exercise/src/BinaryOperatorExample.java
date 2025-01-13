import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(10, 10));

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(10, 10));
    }
}
