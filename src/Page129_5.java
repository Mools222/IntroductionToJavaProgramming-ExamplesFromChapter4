
public class Page129_5 {
    public static void main(String[] args) {
        char x = 'a';                           // x = a = 97
        char y = 'c';                           // y = c = 99
        System.out.println(++x);                // x = b = 98
        System.out.println(y++);                // y = d = 100
        System.out.println(x - y);              // 98 - 100 = -2

        // Test

        x = 'a';                                // x = a = 97
        y = 'c';                                // y = c = 99
        System.out.println(++x - y++);          // 98 - 99 = -1

        // Test 2

        x = 'a';                                // x = a = 97
        y = 'c';                                // y = c = 99
        x = ++x;                                // x = c = 98
        y = y++;                                // y = d = 100 (but the original var value is used in the statement)
        System.out.println(x - y);              // 98 - 99 = -1

    }
}
