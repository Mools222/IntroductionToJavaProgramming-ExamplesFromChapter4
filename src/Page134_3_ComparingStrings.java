public class Page134_3_ComparingStrings {

    public static void main(String[] args) {

        System.out.println("Welcome to Java".startsWith("We"));
        System.out.println("Welcome to Java".startsWith("we"));
        System.out.println("Welcome to Java".endsWith("va"));
        System.out.println("Welcome to Java".endsWith("v"));
        System.out.println("Welcome to Java".contains("to"));
        System.out.println("Welcome to Java".contains("To"));

        // Test

        String a = "Welcome to Java";
        boolean b = a.startsWith("We");
        System.out.println(b);
    }
}
