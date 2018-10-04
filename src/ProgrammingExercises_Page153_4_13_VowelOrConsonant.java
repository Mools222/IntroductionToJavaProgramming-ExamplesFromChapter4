import java.util.Scanner;

public class ProgrammingExercises_Page153_4_13_VowelOrConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {

            // Convert char to string and uppercase it at the same time
            String letter = ("" + ch).toUpperCase();

            String vowels = "AEIOUY";
            String consonants = "BCDFGHJKLMNPQRSTVWXZ";

            if (vowels.contains(letter))
                System.out.println(ch + " is a vowel");
            else if (consonants.contains(letter))
                System.out.println(ch + " is a consonant");
            else
                System.out.println(ch + " is an invalid input");

        // }
        // else
        //    System.out.println(ch + " is an invalid input");



    }
}
