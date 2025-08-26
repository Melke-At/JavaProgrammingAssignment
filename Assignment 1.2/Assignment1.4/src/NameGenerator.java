import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] firstName = { "Melke", "Nathan", "Amu", "Yoti", "Hiwi" };
        String[] lastName = { "Yeh", "Atl", "Zak", "Kris", "Klaus" };

        System.out.print("how many random names you want to generate ");
        int count = input.nextInt();

        System.out.println("\nGenerated Names:");

        for (int i = 0;  i < count; i++) {
            int firstIndex = (int) (Math.random() * firstName.length);
            int lastIndex = (int) (Math.random() * lastName.length);
            String fullName = firstName[firstIndex] + " " + lastName[lastIndex];
            System.out.println(fullName);

        }

    }
}
