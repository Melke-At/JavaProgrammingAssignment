import java.util.Arrays;
import java.util.List;

public class FunctionalOperations {
    public static void main(String[] args) {
        // Task 1: Mean of array
        int[] arr = {10, 20, 30, 40, 50};
        double mean = Arrays.stream(arr).average().orElse(0.0);
        System.out.println("Mean: " + mean);

        // Task 2: Filter, Transform, and Sum
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = list.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}
