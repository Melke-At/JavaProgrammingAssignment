import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Give the coefficient of quadratic equation a ,b ,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2 * a);
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2 * a);

       if (a!=0 && Math.pow(b,2) > 4*a*c){
           System.out.println(r1 + " " + r2);
       }
       else{
           System.out.println(" No real roots");
       }

    }
}
