import java.util.Scanner;

public class ProgrammingExercises_Page154_4_15_PhoneKeyPads {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Convert char to string and uppercase it at the same time
        // Why didn't I just make a String input?
        String letter = ("" + ch).toUpperCase();

        String lettersUnder2 = "ABC";
        String lettersUnder3 = "DEF";
        String lettersUnder4 = "GHI";
        String lettersUnder5 = "JKL";
        String lettersUnder6 = "MNO";
        String lettersUnder7 = "PQRS";
        String lettersUnder8 = "TUV";
        String lettersUnder9 = "WXYZ";

        String pasta = "The corresponding number is ";

        if (lettersUnder2.contains(letter))
            System.out.println(pasta + "2");
        else if (lettersUnder3.contains(letter))
            System.out.println(pasta + "3");
        else if (lettersUnder4.contains(letter))
            System.out.println(pasta + "4");
        else if (lettersUnder5.contains(letter))
            System.out.println(pasta + "5");
        else if (lettersUnder6.contains(letter))
            System.out.println(pasta + "6");
        else if (lettersUnder7.contains(letter))
            System.out.println(pasta + "7");
        else if (lettersUnder8.contains(letter))
            System.out.println(pasta + "8");
        else if (lettersUnder9.contains(letter))
            System.out.println(pasta + "9");
        else
            System.out.println(ch + " is an invalid input");


        // Alternative solution

        ch = Character.toUpperCase(ch);

        if (ch >= 65 && ch <= 67)
            System.out.println(pasta + "2");
        else if (ch >= 68 && ch <= 70)
            System.out.println(pasta + "3");
        else if (ch >= 71 && ch <= 73)
            System.out.println(pasta + "4");
        else if (ch >= 74 && ch <= 76)
            System.out.println(pasta + "5");
        else if (ch >= 77 && ch <= 79)
            System.out.println(pasta + "6");
        else if (ch >= 80 && ch <= 83)
            System.out.println(pasta + "7");
        else if (ch >= 84 && ch <= 86)
            System.out.println(pasta + "8");
        else if (ch >= 87 && ch <= 90)
            System.out.println(pasta + "9");
        else
            System.out.println(ch + " is an invalid input");



    }
}
