import java.util.Scanner;

public class ProgrammingExercises_Page153_4_9_UnicodeOfCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int casting = (int)ch;

        System.out.println("The Unicode for the character E is " + casting);

    }
}
