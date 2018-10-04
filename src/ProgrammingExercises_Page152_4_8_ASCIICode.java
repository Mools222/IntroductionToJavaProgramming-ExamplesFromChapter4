import java.util.Scanner;

public class ProgrammingExercises_Page152_4_8_ASCIICode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        char casting = (char)ascii;

        System.out.println("The character for ASCII code 69 is " + casting);


    }

}
