public class Page136_1_FindingCharOrSubstringInString {
    public static void main(String[] args) {


        // Note that it counts from 0, not 1, so the first letter is number 0
        // Note that '' means char and "" means String

        System.out.println("Welcome to Java".indexOf('W'));
        System.out.println("Welcome to Java".indexOf('o'));
        System.out.println("Welcome to Java".indexOf('o', 5)); // The ", 5" skips the first 'o' in "Welcome" - Den kigger kun på bogstaverne EFTER det 5. tegn - Returns 9
        System.out.println("Welcome to Java".indexOf('o', 3)); // The ", 3" doesn't skip the first "o" in "Welcome", since it's number 4 in the row - Returns 4

        System.out.println("Welcome to Java".indexOf("come"));

        System.out.println("Welcome to Java".indexOf("Java", 5)); // The ", 5" is redundant - Ordet Java fremkommer jo ikke før det 5. bogstav
        System.out.println("Welcome to Java".indexOf("Java")); // Test to prove the above

        System.out.println("Welcome to Java".indexOf("java", 5)); // The ", 5" is redundant here as well
        System.out.println("Welcome to Java".indexOf("java")); // Test to prove the above



        System.out.println("Welcome to Java".lastIndexOf('W'));
        System.out.println("Welcome Wo Wava".lastIndexOf('W')); // Test. Returns 11

        System.out.println("Welcome to Java".lastIndexOf('o')); // Returns 9 (the index of the 'o' in "to")
        System.out.println("Welcome to Java".lastIndexOf('o', 5)); // "The ", 5" skips the last 'o' in "to" - Den kigger kun på bogstaverne FØR det 5. tegn - Returns 4, fordi den kun kigger på de første 5 bogstaver
        System.out.println("Welcome to Java".lastIndexOf('o', 3)); // Test. Returns -1, fordi den ikke kan finde et 'o' indenfor de første 3 bogstaver


        System.out.println("Welcome to Java".lastIndexOf("come"));
        System.out.println("Welcome to Java".lastIndexOf("Java", 5)); // REturns -1, for der er intet "Java" inden for de første 5 bogstaver
        System.out.println("Welcome to Java".lastIndexOf("Java"));


        // Test
        System.out.println("Doing tests");

        String hello = "Welcome to Java";
        int a = hello.indexOf('c');
        int b = hello.indexOf("c");
        int c = hello.indexOf("come");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d = hello.indexOf(' ');
        System.out.println(d);
        int e = hello.indexOf(" ");
        System.out.println(e);
        int f = hello.lastIndexOf(' ');
        System.out.println(f);
        int g = hello.lastIndexOf(" ");
        System.out.println(g);





    }
}
