
import java.util.Scanner;

public class Page128_ComparingAndTestingCharacters {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input a char");
        char ch = input.next().charAt(0);

        // A-Z går i decimal fra 65 til 90
        // Denne if statement tjekker om ch er større eller lig med 65 (A) og om den er mindre eller lig med 90 (Z)
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");

            // a-z går i decimal fra 97 til 122
            // Denne if statement tjekker om ch er større eller lig med 97 (a) og om den er mindre eller lig med 122 (z)
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");

            // 0-9 går i decimal fra 48 til 57
            // Denne if statement tjekker om ch er større eller lig med 48 (0) og om den er mindre eller lig med 57 (9)
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");


        // Test
        char test1 = 65;
        char test2 = 90;
        System.out.println(test1 + " " + test2);
        char test3 = 97;
        char test4 = 122;
        System.out.println(test3 + " " + test4);
        char test5 = 48;
        char test6 = 57;
        System.out.println(test5 + " " + test6);

        // Next

        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));

    }
}