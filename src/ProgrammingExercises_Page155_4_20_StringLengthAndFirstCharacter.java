import java.util.Scanner;

public class ProgrammingExercises_Page155_4_20_StringLengthAndFirstCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.next();

        System.out.println("The length of the string is " + string.length() + " and its first character is " + string.charAt(0));
    }
}
