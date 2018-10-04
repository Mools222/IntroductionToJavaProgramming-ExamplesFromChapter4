import java.util.Scanner;

public class Page132_1_StringFromConsole {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next(); // Bemærk at input.next() kun kan læse 1 ord - Brug input.nextLine() til flere ord og tegn
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);



        // To avoid input errors, do not use nextLine() after nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), or next().
        // Så jeg bliver nødt til at lave Page132_2 for at teste det næste
    }
}
