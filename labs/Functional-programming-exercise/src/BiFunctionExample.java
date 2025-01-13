import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

    // Method to return a list of integers
    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        return numbers; // Return the list
    }

    public static void main(String[] args) {

        // takes two Integers and return an Integer

        BiFunction<Integer, Integer, String> numberTimesAnother = (Integer number1, Integer number2) -> String.format("%d multiplied %d is equal to %d", number1, number2, number1 * number2);

        System.out.println(numberTimesAnother.apply(5, 55));

        // take two Integers and return a List<Integer>

        BiFunctionExample example = new BiFunctionExample();
        List<Integer> myNumbers = example.getNumbers(); // Call the method
        System.out.println(myNumbers); // Output the list


    }
}