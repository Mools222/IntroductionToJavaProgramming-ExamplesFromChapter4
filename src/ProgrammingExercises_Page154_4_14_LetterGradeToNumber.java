import java.util.Scanner;

public class ProgrammingExercises_Page154_4_14_LetterGradeToNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");

        // Takes input + Converts to uppercase
        char ch = Character.toUpperCase(input.next().charAt(0));

        String pasta = "The numeric value for grade ";

        switch (ch) {
            case 'A':
                System.out.println(pasta + ch + " is 4");
                break;
            case 'B':
                System.out.println(pasta + ch + " is 3");
                break;
            case 'C':
                System.out.println(pasta + ch + " is 2");
                break;
            case 'D':
                System.out.println(pasta + ch + " is 1");
                break;
            case 'F':
                System.out.println(pasta + ch + " is 0");
            default:
                System.out.println(ch + " is an invalid grade");
        }

    }
}
