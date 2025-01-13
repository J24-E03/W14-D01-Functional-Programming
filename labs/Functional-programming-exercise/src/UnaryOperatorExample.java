import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = a -> a + a;
        System.out.println(unaryOperator.apply(10));
    }
}
