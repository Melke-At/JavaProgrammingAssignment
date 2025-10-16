import java.util.*;

class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));

        System.out.println("Original list: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After removing even numbers: " + numbers);

        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling odd numbers: " + numbers);

        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum of numbers: " + sum[0]);
    }
}
