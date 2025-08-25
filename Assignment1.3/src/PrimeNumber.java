import java.util.Scanner;
public class PrimeNumber
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start;
        int end;

        do {
            System.out.println("Enter two numbers: ");

            start = Integer.parseInt(input.nextLine());
            end = Integer.parseInt(input.nextLine());
        }
        while(start > end);

        System.out.print("Prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i < 2) {
                isPrime = false;

            }
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
