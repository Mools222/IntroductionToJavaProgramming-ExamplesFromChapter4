import java.util.Scanner;

public class ProgrammingExercises_Page153_4_12_HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;

            int overEight = value / 8;
            int a = overEight * 1000;
            value = value - (overEight * 8);


            int overFour = value / 4;
            int b = overFour * 100;
            value = value - (overFour * 4);

            int overTwo = value / 2;
            int c = overTwo * 10;
            value = value - (overTwo * 2);

            //int overOne = value / 1;
            //int d = overOne * 1;
            //value = value - (overOne * 1);

            int d = value;

            int binary = (a + b + c + d);

            System.out.printf("The binary value is %01d", binary);
        }
        else if (Character.isDigit(ch)) {
            int value = ch - '0';

            int overEight = value / 8;
            int a = overEight * 1000;
            value = value - (overEight * 8);

            int overFour = value / 4;
            int b = overFour * 100;
            value = value - (overFour * 4);

            int overTwo = value / 2;
            int c = overTwo * 10;
            value = value - (overTwo * 2);

            //int overOne = value / 1;
            //int d = overOne * 1;
            //value = value - (overOne * 1);

            int d = value;

            int binary = (a + b + c + d);

            System.out.printf("The binary value is %04d", binary);

        }
        else
            System.out.println(ch + " is an invalid input");




    }
}