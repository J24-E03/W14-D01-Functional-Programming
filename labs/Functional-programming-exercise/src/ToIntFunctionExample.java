import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {

        // lambda expression to find square of number using ToIntFunction FI
        ToIntFunction<Integer> toIntFunction = a -> a * a;
        System.out.println(toIntFunction.applyAsInt(3));

        // computing Square of an Integer using Function FI
        Function<Integer, Integer> function = a -> a * a;
        System.out.println(function.apply(3));
    }
}
