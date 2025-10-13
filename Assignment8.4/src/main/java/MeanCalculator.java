import java.util.Arrays;

public class MeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double mean = Arrays.stream(numbers)
                .average() // returns OptionalDouble
                .orElse(0.0);

        System.out.println("Mean: " + mean);
    }
}
