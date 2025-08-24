import java.util.Scanner;

public class FahrenheitCelsiusConverter {
    public static void main(String[] args) {

        float fahrenheit;
        float celsius;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Temperature in Fahrenheit: ");
        fahrenheit = input.nextFloat();

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(" The temperature is : " + celsius + " C");
    }
}