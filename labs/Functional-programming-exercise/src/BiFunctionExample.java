import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> number = (a, b) -> a + b;
        System.out.println(number.apply(5, 7)); // 12

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List> list = (a, b) -> Arrays.asList(a, b);
        System.out.println(list.apply(5, 7)); // [5, 7]
    }
}
