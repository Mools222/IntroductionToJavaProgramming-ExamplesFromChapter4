public class Page127_CharCasting {
    public static void main(String[] args) {

        char ch = (char)0XAB0041; // The lower 16 bits hex code 0041 is assigned to ch
        System.out.println(ch); // ch is character A

        // Next

        char ch2 = (char)65.25; // Decimal 65 is assigned to ch
        System.out.println(ch2); // ch is character A

        // Next

        int i = (int)'A'; // The Unicode of character A is assigned to i
        System.out.println(i); // i is 65

        // Next (implicit casting)

        byte b = 'a';
        int i2 = 'a';
        System.out.println(b);
        System.out.println(i2);

        // Test implicit casting (note the lack of '')

        char test = 65;
        System.out.println(test);

        // Next

        byte b2 = (byte)'\uFFF4';
        System.out.println("uFFF4 " + b2);

        // Test implicit casting (note the lack of '')

        // Any positive integer between 0 and FFFF in hexadecimal can be cast into a character implicitly.

        // Dette skulle gerne svare til "0"
        // Minimum value is '\u0000' (or 0)
        char test2 = 0;
        System.out.println(test2);

        // Dette skulle gerne svare til "FFFF"
        // Maximum value is '\uffff' (or 65,535 inclusive)
        char test3 = 65535;
        System.out.println(test3);

        // Dette er "BBBB"
        char test4 = 48059;
        System.out.println(test4);

        char test5 = '\uBBBB';
        System.out.println(test5);


        // Next

        int i3 = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        System.out.println("i is " + i3); // i is 101
        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("j is " + j); // j is 99
        System.out.println(j + " is the Unicode for character "
                + (char)j); // 99 is the Unicode for character c
        System.out.println("Chapter " + '2');


        // Test



    }
}
