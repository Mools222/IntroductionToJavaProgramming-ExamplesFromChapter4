public class Page125_and_126_Char {
    public static void main(String[] args) {


        char letter = 'A';
        char numChar = '4';

        System.out.println(letter);
        System.out.println(numChar);

        // Test
        char numChar2 = 4;
        System.out.println(numChar2);

        // Next

        char a = '\u6B22';
        char b = '\u8FCE';
        System.out.println(a + "" + b);

        // Test
        String a1 = "\u6B22\u8FCE";
        System.out.println(a1);
        String poop = "\uE05A";
        System.out.println(poop);

        // Next

        char c = '\u03b1';
        char d = '\u03b2';
        char e = '\u03b4';
        System.out.println(c + " " + d + " " + e);

        // Test

        // Number 0-9 in decimal
        char test1 = 48;
        char test2 = 49;
        char test3 = 50;
        char test4 = 51;
        char test5 = 52;
        char test6 = 53;
        char test7 = 54;
        char test8 = 55;
        char test9 = 56;
        char test10 = 57;
        System.out.println(test1 + "" + test2 + "" + test3 + "" + test4 + "" + test5 + "" + test6 + "" + test7 + "" + test8 + "" +test9 + "" + test10);

        // Number 0-9 in Unicode
        char test11 = '\u0030';
        char test12 = '\u0039';
        System.out.println(test11 + " " + test12);

        // Upper case letters A-Z in decimal
        char letterACaps = 65;
        char letterZCaps = 90;
        System.out.println(letterACaps + " " + letterZCaps);

        // Upper case letters A-Z in Unicode
        char letterACaps2 = '\u0041';
        char letterZCaps2 = '\u005A';
        System.out.println(letterACaps2 + " " + letterZCaps2);

        // Lower case letters a-z in decimal
        char letterALowerCase = 97;
        char letterZLowerCase = 122;
        System.out.println(letterALowerCase + " " + letterZLowerCase);

        // Lower case letters a-z in Unicode
        char letterALowerCase2 = '\u0061';
        char letterZLowerCase2 = '\u007A';
        System.out.println(letterACaps2 + " " + letterZCaps2);


        // Nextpage

        char letter1 = 'A';
        char letter2 = '\u0041'; // Character A's Unicode is 0041
        System.out.println(letter1 + " " + letter2);

        // Next

        char ch = 'a';
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(++ch);


    }
}
