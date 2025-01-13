import java.util.List;
import java.util.function.ToIntFunction;

public class ToIntFunctionExample
{
    public static void main(String[] args) {

        // lambda expression to find square of number using ToIntFunction FI
        ToIntFunction<Integer> f = i -> i*i;

        // computing Square of an Integer using Function FI
        System.out.println("1. The Square of number 5 is \t: "
                + f.applyAsInt(5));

        System.out.println("2. The Square of number 9 is \t: "
                + f.applyAsInt(9));

        System.out.println("3. The Square of number 27 is \t: "
                + f.applyAsInt(27));

        System.out.println("4. The Square of number 33 is \t: "
                + f.applyAsInt(33));

        System.out.println("5. The Square of number 43 is \t: "
                + f.applyAsInt(43));
    }
}