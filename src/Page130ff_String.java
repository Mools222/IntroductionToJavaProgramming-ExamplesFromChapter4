public class Page130ff_String {
    public static void main(String[] args) {

        String message = "Welcome to Java";

        System.out.println(message);

        // Next

        System.out.println("The length of " + message + " is " + message.length());

        // Test
        int test = message.length();
        System.out.println(test);

        // The thing in "Note"

        System.out.println("Welcome to Java".length());
        System.out.println("".length());

        // Next

        // Note that the first letter is 0, not 1
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(14));
        // System.out.println(message.charAt(15));

        char test1 = message.charAt(0);
        System.out.println("Notice that this is a char, not a String, even thought it comes from a String: " + test1);


        // Next

        String s1 = "Test 1 ";
        String s2 = "Test 2";

        String s3 = s1.concat(s2);
        String s4 = s1 + s2;

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        // NExt

        String myString = message + " and " + "HTML";
        System.out.println(myString);

        // Next

        // Three strings are concatenated
        String message2 = "Welcome " + "to " + "Java";
        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        // String Supplement is concatenated with character B
        String s11 = "Supplement" + 'B'; // s1 becomes SupplementB

        System.out.println(message2);
        System.out.println(s);
        System.out.println(s11);

        // Test
        String x1 = "Chapter" + 2 + 12;
        System.out.println(x1);
        String x2 = "Chapter" + (2 + 12);
        System.out.println(x2);
        String x3 = "Chapter" + 2 * 12;
        System.out.println(x3);
        String x4 = "Chapter" + 2 / 2;
        System.out.println(x4);
        // String x5 = "Chapter" + 2 - 12;
        // System.out.println(x5);
        String x6 = "Chapter" + (2 - 12);
        System.out.println(x6);

        // Next

        System.out.println(message += " and Java is fun");

        // Test
        message = "Welcome to Java"; // Gotta reset what message says, since the above statement changed it

        System.out.println(message + " and Java is fun");

        // Test
        String message11 = "Welcome to Java";
        String message22 = "Welcome to Java";

        message11 = message11 + " and Java is fun";
        message22 += " and Java is fun";

        System.out.println(message11);
        System.out.println(message22);

        // Next

        int i = 1;
        int j = 2;

        System.out.println("i + j is " + i + j);
        System.out.println("i + j is " + (i + j));

        // Next

        System.out.println("Welcome".toLowerCase());
        System.out.println("Welcome".toUpperCase());

        System.out.println("\t Good Night \n");
        System.out.println("\t Good Night \n".trim());

    }
}
