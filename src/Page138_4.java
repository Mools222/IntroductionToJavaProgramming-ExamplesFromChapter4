public class Page138_4 {
    public static void main(String[] args) {

        String s1 = " Welcome ";
        String s2 = " welcome ";


        boolean isEqual = s1.equals(s2);

        boolean isEqual2 = s1.equalsIgnoreCase(s2);

        int x = s1.compareTo(s2);

        int x2 = s1.compareToIgnoreCase(s2);

        boolean b = s1.startsWith("AAA");

        boolean b2 = s1.endsWith("AAA");

        int x3 = s1.length();

        char x4 = s1.charAt(0);

        String s3 = s1 + s2;
        String s33 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s33);

        String substring = s1.substring(1);
        System.out.println(substring);

        String substring2 = s1.substring(1, 5); // Returns this string’s substring that begins at the specified beginIndex (1 = W) and extends to the character at index endIndex – 1 (5-1 = c)
        System.out.println(substring2);

        String s333 = s1.toLowerCase();
        System.out.println(s333);

        String s3333 = s1.toUpperCase();
        System.out.println(s3333);

        String s33333 = s1.trim();
        System.out.println(s33333);

        int x5 = s1.indexOf('e');
        System.out.println(x5);

        int x6 = s1.lastIndexOf("abc");
        System.out.println(x6);


    }
}
