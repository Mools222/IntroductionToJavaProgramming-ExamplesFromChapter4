import java.util.Scanner;

public class ProgrammingExercises_Page155_4_19_ISBN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String digit = input.next();

        int digit1 = Integer.parseInt(digit.substring(0, 1));
        int digit2 = Integer.parseInt(digit.substring(1, 2));
        int digit3 = Integer.parseInt(digit.substring(2, 3));
        int digit4 = Integer.parseInt(digit.substring(3, 4));
        int digit5 = Integer.parseInt(digit.substring(4, 5));
        int digit6 = Integer.parseInt(digit.substring(5, 6));
        int digit7 = Integer.parseInt(digit.substring(6, 7));
        int digit8 = Integer.parseInt(digit.substring(7, 8));
        int digit9 = Integer.parseInt(digit.substring(8, 9));

        int ISBN = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        String a = "The ISBN-10 number is ";

        if (ISBN == 10)
            System.out.println(a + digit + "X");
        else
            System.out.println(a + digit + ISBN);

        // Den løsning jeg lavede fordi jeg havde glemt Integer.parseInt() fandtes

        int d1 = digit.charAt(0) - '0';
        int d2 = digit.charAt(1) - '0';
        int d3 = digit.charAt(2) - '0';
        int d4 = digit.charAt(3) - '0';
        int d5 = digit.charAt(4) - '0';
        int d6 = digit.charAt(5) - '0';
        int d7 = digit.charAt(6) - '0';
        int d8 = digit.charAt(7) - '0';
        int d9 = digit.charAt(8) - '0';

        int ISBN2 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        String a2 = "The ISBN-10 number is ";

        if (ISBN2 == 10)
            System.out.println(a2 + digit + "X");
        else
            System.out.println(a2 + digit + ISBN2);

    }
}
