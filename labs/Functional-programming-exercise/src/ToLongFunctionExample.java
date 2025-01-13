import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {

        // lambda expression to multiply number with 1024 using ToLongFunction FI
        ToLongFunction<Integer> toLongFunction = a -> a * 1024;
        System.out.println(toLongFunction.applyAsLong(10));

        // multiply below number using above ToLongFunction FI
        System.out.println(toLongFunction.applyAsLong(100));
    }
}
