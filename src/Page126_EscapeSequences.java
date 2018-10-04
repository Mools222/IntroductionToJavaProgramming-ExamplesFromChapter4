public class Page126_EscapeSequences {
    public static void main(String[] args) {

        System.out.println("He said \"Java is fun\"");


        // Test

        System.out.println('\u03b1');

        // Test

        System.out.println("He said \t \t \"Java is fun\"");
        System.out.println("The guy said \t \"Java is fun\"");

        // Next

        System.out.println("\\t is a tab character");

        // Test
        System.out.println("He said\b\b \"Backspace is fun\"");

        System.out.println("He said\u0008\u0008 \"Backspace is fun\"");

        System.out.println("He said \n \"Linefeed is fun\"");

        System.out.println("He said\f \"Formfeed doesn´t work\"");

        System.out.println("He said\r \"Carriage Return is fun\"");

        System.out.println("He said \\ \"Backslash is fun\"");




    }
}
