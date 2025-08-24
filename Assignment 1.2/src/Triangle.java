import java.util.Scanner;

import static java.lang.Math.sqrt;

public class  Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the right triangle: ");
        float height = input.nextFloat();

        System.out.print("Enter the width of the right triangle: ");
        float width = input.nextFloat();

        float hypotenuse = (float) sqrt(height*height + width*width);

        System.out.println("The hypotenuse of the given right angle triangle is " + hypotenuse);

    }
}
