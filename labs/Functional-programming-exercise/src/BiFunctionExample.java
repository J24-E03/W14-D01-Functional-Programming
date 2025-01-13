import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(5, 7));

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, Integer> biFunction2 = (a, b) -> a + b;
        System.out.println(biFunction2.apply(5, 10));

        BiFunction<Integer, Integer, List<Integer>> biFunction3 = (a, b) -> Arrays.asList(a + b, a - b, a * b, a / b);
        System.out.println(biFunction3.apply(50, 20));
    }
}
