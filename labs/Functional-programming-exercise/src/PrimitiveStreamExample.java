import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersinListStructure(numbers);
    }

    private static void printOddNumbersinListStructure(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

}