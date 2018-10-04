public class Page138_2 {
    public static void main(String[] args) {

        System.out.println("1" + 1); // String og tal bliver concatenated til en String hvor der står 11
        System.out.println('1' + 1); // 49 (1's Unicode value) + 1 = 50
        System.out.println("1" + 1 + 1); // Det bliver concatenated til en string hvor der står 111
        System.out.println("1" + (1 + 1)); // Først bliver (1 + 1) udregnet til 2 - Så bliver String og tal concatenated til en String hvor der står 12
        System.out.println('1' + 1 + 1); // 49 (1's Unicode value) + 1 + 1 = 51

        // Test

        // All numeric operators can be applied to char operands. A char operand is automatically
        // cast into a number if the other operand is a number or a character. If the other operand
        // is a string, the character is concatenated with the string.

        char a = '1';
        System.out.println(a);

        System.out.println(a + 4);

        char b = (int)'1'; // Jeg tror ikke det her gør noget
        System.out.println(b);

        System.out.println(b + 5);

        char c = 1; // Unicode
        System.out.println(c);
        char cc = 35; // Unicode
        System.out.println(cc);

        int d = '1';
        System.out.println(d);

    }
}
