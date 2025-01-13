import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {
        // lambda expression to multiply number with 1024 using ToLongFunction FI
        ToLongFunction<Integer> ob = num -> num * 1024;
        System.out.println(ob.applyAsLong(8));

        // multiply below number using above ToLongFunction FI
        System.out.println(ob.applyAsLong(16));
        System.out.println(ob.applyAsLong(32));
        System.out.println(ob.applyAsLong(64));
    }
}
