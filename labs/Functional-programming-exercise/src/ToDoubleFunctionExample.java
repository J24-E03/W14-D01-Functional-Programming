import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {

        // lambda expression for ToDoubleFunction FI for subtraction to get double value
        ToDoubleFunction<Integer> df = i -> i - 0.5;

        // testing for different numbers using above lambda expression
        System.out.println("1. After discount, for 5 is \t= "
                + df.applyAsDouble(5));

        System.out.println("2. After discount, for 7 is \t= "
                + df.applyAsDouble(7));

        System.out.println("3. After discount, for 32 is \t= "
                + df.applyAsDouble(32));

        System.out.println("4. After discount, for 28 is \t= "
                + df.applyAsDouble(28));

        System.out.println("5. After discount, for 25 is \t= "
                + df.applyAsDouble(55));

    }
}
