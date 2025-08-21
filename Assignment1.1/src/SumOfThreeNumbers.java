import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give The first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give The second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give The third number: ");
        int third = Integer.parseInt(scanner.nextLine());



        double sum = (first + second + third);
        double product = (first*second*third);
        double average = sum/3;

        System.out.println("The sum of the three numbers is " + sum);
        System.out.println("The product of the three numbers is " + product);
        System.out.println("The average of the three numbers is " + average);
    }
}
