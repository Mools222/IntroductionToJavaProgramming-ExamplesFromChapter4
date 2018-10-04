public class Page134_1_ComparingStrings {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "Hello";

        if (string1 == string2)
            System.out.println("string1 and string2 are the same object");
        else
            System.out.println("string1 and string2 are different objects");

        // Test

        String string01 = "Hello";
        String string02 = "Hello";

        String string11 = string01;
        String string22 = string02;

        if (string11 == string22)
            System.out.println("string1 and string2 are the same object");
        else
            System.out.println("string1 and string2 are different objects");


        // Test (constructed stuff)

        Stringystring myString1 = new Stringystring ("Hello!");
        System.out.println("myString1 says " + myString1.stringy);

        Stringystring myString2 = new Stringystring ("Hello!");
        System.out.println("myString2 says " + myString2.stringy);

        System.out.println(myString1);
        System.out.println(myString2);

         if (myString1.stringy == myString2.stringy)
            System.out.println("myString1.stringy and myString2.stringy are the same object");
        else
            System.out.println("myString1.stringy and myString2.stringy are different objects");

        if (myString1 == myString2) // myString1 og myString2 er vel slet ikke strings?
            System.out.println("myString1 and myString2 are the same object");
        else
            System.out.println("myString1 and myString2 are different objects");

        if (myString1.equals(myString2)) // myString1 og myString2 er vel slet ikke strings? Hvorfor virker equals() så på dem?
            System.out.println("myString1 and myString2 have the same contents");
        else
            System.out.println("myString1 and myString2 are not equal");

        // int a = 1;
        // int b = 2;
        // if (a.equals(b)) // equals() definitely doesn't work on int
        //     System.out.println("a and b have the same contents");
        // else
        //     System.out.println("a and b are not equal");

        // Test from https://stackoverflow.com/questions/7520432/what-is-the-difference-between-vs-equals-in-java

        String s1 = new String("someString");
        System.out.println(s1);
        String s2 = new String("someString");
        System.out.println(s2);

        if (s1 == s2)
            System.out.println("s1 and s2 are the same object");
        else
            System.out.println("s1 and s2 are different objects");

        if (s1.equals(s2))
            System.out.println("s1 and s2 have the same contents");
        else
            System.out.println("s1 and s2 are not equal");

        // Next

        if (string1.equals(string2))
            System.out.println("string1 and string2 have the same contents");
        else
            System.out.println("string1 and string2 are not equal");

        // Next

        String s11 = "Welcome to Java";
        String s22 = "Welcome to Java";
        String s33 = "Welcome to C++";
        System.out.println(s11.equals(s22)); // true
        System.out.println(s11.equals(s33)); // false

        // Test equalsIgnoreCase()

        String s111 = "Welcome to Java";
        String s222 = "welcome to java";

        System.out.println(s111.equals(s222));
        System.out.println(s111.equalsIgnoreCase(s222));

    }

}


class Stringystring {

    String stringy;

    public Stringystring(String inputString) {
        this.stringy = inputString;
    }
}