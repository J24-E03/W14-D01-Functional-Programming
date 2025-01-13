import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {

        // lambda expression for ToDoubleFunction FI for subtraction to get double value
        ToDoubleFunction<Integer> function = a -> a;
        System.out.println(function.applyAsDouble(10));

        // testing for different numbers using above lambda expression
        System.out.println(function.applyAsDouble(0));
        System.out.println(function.applyAsDouble(100));
        System.out.println(function.applyAsDouble(1_000));
    }
}
