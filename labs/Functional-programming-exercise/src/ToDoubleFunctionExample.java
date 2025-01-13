import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {
        // lambda expression for ToDoubleFunction FI for subtraction to get double value
        ToDoubleFunction<Integer> toDoubleFunction = value -> value - 10;
        System.out.println(toDoubleFunction.applyAsDouble(20)); // testing for 20

        // testing for different numbers using above lambda expression
        System.out.println(toDoubleFunction.applyAsDouble(-10));
        System.out.println(toDoubleFunction.applyAsDouble(-20));
        System.out.println(toDoubleFunction.applyAsDouble(-30));
        System.out.println(toDoubleFunction.applyAsDouble(30));
        System.out.println(toDoubleFunction.applyAsDouble(40));
        System.out.println(toDoubleFunction.applyAsDouble(50));
    }
}
