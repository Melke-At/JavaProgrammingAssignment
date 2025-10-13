import java.util.Arrays;
import java.util.List;

public class FunctionalListProcessing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)   // keep only odd numbers
                .map(n -> n * 2)           // double each remaining number
                .reduce(0, Integer::sum);  // sum them all

        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}
