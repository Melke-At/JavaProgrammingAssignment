import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println(" Integers: " + (startIndex + 1) + " - " + (endIndex + 1));

        input.close();
    }
}

