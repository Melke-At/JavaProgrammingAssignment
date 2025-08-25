import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int score = 0;

        for (int i = 1;  i <= 10; i++) {
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;
            int correctAnswer = num1 * num2;

            System.out.println(" problem " + i + ": what is " + num1 + " * " + num2 + "? ");
            int answer1 = input.nextInt();

            if (answer1 == correctAnswer) {
                System.out.println(" congratulations your answer is Correct!");
                score++;
            } else {
                System.out.println(" your answer is incorrect! " + correctAnswer + " is the correct answer ");
            }
        }
            System.out.println("You scored " + score + " out of 10.");

            if (score == 10) {
                System.out.println(" congratulations! you have mastered the multiplication table! ");
                break;
            }

            else
            {
                System.out.println(" Let's try again to get a perfect score! ");
            }
            }
        }



}
