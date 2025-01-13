import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        // lambda expression to find square of number using ToIntFunction FI
        ToIntFunction<Integer> ob = num -> num * num;
        System.out.println(ob.applyAsInt(5));

        // computing Square of an Integer using Function FI
        Function<Integer, Integer> ob1 = num -> num * num;
        System.out.println(ob1.apply(5));
    }
}
