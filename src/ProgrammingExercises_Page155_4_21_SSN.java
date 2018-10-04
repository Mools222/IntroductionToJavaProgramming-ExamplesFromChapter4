import java.util.Scanner;

public class ProgrammingExercises_Page155_4_21_SSN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String socSecNum = input.next();

        if (socSecNum.length() != 11)
            System.out.println(socSecNum + " is an invalid social security number");
        else {
            char char1 = socSecNum.charAt(0);
            char char2 = socSecNum.charAt(1);
            char char3 = socSecNum.charAt(2);
            char char4 = socSecNum.charAt(3);
            char char5 = socSecNum.charAt(4);
            char char6 = socSecNum.charAt(5);
            char char7 = socSecNum.charAt(6);
            char char8 = socSecNum.charAt(7);
            char char9 = socSecNum.charAt(8);
            char char10 = socSecNum.charAt(9);
            char char11 = socSecNum.charAt(10);

            if (Character.isDigit(char1) && Character.isDigit(char2) && Character.isDigit(char3) && char4 == '-' && Character.isDigit(char5) && Character.isDigit(char6) &&
                    char7 == '-' && Character.isDigit(char8) && Character.isDigit(char9) && Character.isDigit(char10) && Character.isDigit(char11))
                System.out.println(socSecNum + " is a valid social security number");
            else
                System.out.println(socSecNum + " is an invalid social security number");
        }

    }
}
