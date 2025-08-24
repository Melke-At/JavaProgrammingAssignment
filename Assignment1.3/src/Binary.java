import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str = input.nextLine();

        int decimal = 0;
        int len = str.length();
        for(int i = 0; i < len; i++){
            char ch = str.charAt(len - i - 1);
            if(ch == '1') {
                decimal += Math.pow(2, i);
            }
        }
        System.out.print(decimal);

    }
}
