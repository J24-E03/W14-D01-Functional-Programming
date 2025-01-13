import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> add = a -> a.length();
        System.out.println(add.apply("Hello, World!"));
    }
}
