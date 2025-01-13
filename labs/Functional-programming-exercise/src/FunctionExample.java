import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> function = a -> a + a;
        System.out.println(function.apply(10));
    }
}
