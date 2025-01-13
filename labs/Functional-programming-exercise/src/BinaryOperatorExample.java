import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        // BiFunction
        BiFunction<Integer, Integer, Integer> func = (a1, b2) -> a1 + b2;

        Integer result = func.apply(1, 2);

        System.out.println(result); // 5

        // BinaryOperator
        BinaryOperator<Integer> func2 = (a1, b2) -> a1 + b2;

        Integer result2 = func.apply(3, 4);

        System.out.println(result2); // 5

    }

}
