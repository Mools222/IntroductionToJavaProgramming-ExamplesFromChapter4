import java.util.Scanner;

public class Page133_CharFromConsole {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);


        // Test

        System.out.print("Enter a character: ");
        char ch2 = input.next().charAt(0);

        System.out.println("The character entered is " + ch2);
    }
}
