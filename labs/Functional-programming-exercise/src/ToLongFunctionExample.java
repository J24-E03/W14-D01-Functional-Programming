import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {

        // lambda expression to multiply number with 1024 using ToLongFunction FI
        ToLongFunction<Integer> f = i -> i*1024;

        // multiply below number using above ToLongFunction FI
        System.out.println("1. 5 * 1024 = \t" + f.applyAsLong(5));

        System.out.println("2. 9 * 1024 = \t" + f.applyAsLong(9));

        System.out.println("3. 27 * 1024 = \t" + f.applyAsLong(27));

        System.out.println("4. 33 * 1024 = \t" + f.applyAsLong(33));

        System.out.println("5. 43 * 1024 = \t" + f.applyAsLong(43));

    }
}
