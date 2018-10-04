public class Page134_2_ComparingStrings {
    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "abg";
        System.out.println(s1.compareTo(s2));

        // Test

        // Unicode: A = 65 og # = 35. 65 - 35 = 30
        String s3 = "abA";
        String s4 = "ab#";
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));

        // Test

        // Unicode: $ = 36. K = 75. 2 = 50
        // Unicode: q = 113. & = 38. @ = 64
        // The actual value returned from the compareTo method depends on the offset of the first two distinct characters in s1 and s2 from left to right.
        // 36 - 113 = -77
        String s5 = "abcde$K2";
        String s6 = "abcdeq&@";
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s5));

        System.out.println(s5.compareToIgnoreCase(s6));
        System.out.println(s6.compareToIgnoreCase(s5));

        // Test

        String s7 = "abc";
        String s8 = "abc";
        System.out.println(s7.compareTo(s8));

        // Test

        char a = 'a';
        char b = 'a';
        // System.out.println(a.compareTo(b));

        // Test

        // Unicode: A = 65. a = 97. 65 - 97 = -32
        String s9 = "A";
        String s10 = "a";
        System.out.println(s9.compareTo(s10));
        System.out.println(s9.compareToIgnoreCase(s10));



    }
}
