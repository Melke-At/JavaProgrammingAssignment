import java.util.Scanner;

public class MedievalWeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double LUOTI_GRAMS = 13.28;
        final double NAULA_GRAMS = 32 * LUOTI_GRAMS;
        final double LEIVISKÄ_GRAMS = 20 * NAULA_GRAMS;

        System.out.print("Weight (g): ");
        double gramsInput = scanner.nextDouble();
        double grams = gramsInput;

        int leiviskä = (int) (grams / LEIVISKÄ_GRAMS);
        grams = grams % LEIVISKÄ_GRAMS;

        int naula = (int) (grams / NAULA_GRAMS);
        grams = grams % NAULA_GRAMS;

        double luoti = grams / LUOTI_GRAMS;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                gramsInput, leiviskä, naula, luoti);

        scanner.close();
    }
}
