public class Page137_2 {
    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));

        System.out.println(s1.charAt(0));

        System.out.println(s1.indexOf('j')); // -1 cause it's not in uppercase
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println(s1.lastIndexOf("o", 15)); // Since it's lastIndexOf the ", 15" means that it looks at all the letters BEFORE the 15th one (which is all of them) - Returns 9
        System.out.println(s1.lastIndexOf("o", 1684854)); // Test
        System.out.println(s1.indexOf("o", 15)); // Test - Since it's IndexOf the ", 15" means that it looks at all the letters AFTER the 15th one (which is none of them) - Returns -1

        System.out.println(s1.length()); // Returns 15, since it counts from 0 to 14 = 15 total

        System.out.println(s1.substring(5)); // "me to Java"
        System.out.println(s1.substring(5, 11)); // "me to " (the space is character number 10)

        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.concat(s2));

        System.out.println(s1.contains(s2));

        System.out.println("\t Wel \t".trim());
        System.out.println("\t Wel \t"); // Test

    }
}
