package view;

import controller.CurrencyController;
import java.util.Scanner;

public class CurrencyView {
    public static void main(String[] args) {
        CurrencyController controller = new CurrencyController();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("From currency code: ");
            String from = sc.next().toUpperCase();

            System.out.print("To currency code: ");
            String to = sc.next().toUpperCase();

            double result = controller.convert(amount, from, to);
            System.out.println(amount + " " + from + " = " + result + " " + to);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
