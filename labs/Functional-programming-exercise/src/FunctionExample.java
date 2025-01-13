import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer,Double> squareOfNumber = (number2)->{return java.lang.Math.pow(number2,2);};

        System.out.println(squareOfNumber.apply(120));





    }
}
