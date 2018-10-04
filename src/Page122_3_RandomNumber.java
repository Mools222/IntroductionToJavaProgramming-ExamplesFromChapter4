public class Page122_3_RandomNumber {
    public static void main(String[] args) {

        // Returns a random integer between 0 and 9.
        System.out.println((int)(Math.random() * 10));

        // Returns a random integer between 50 and 99.
        System.out.println(50 + (int)(Math.random() * 50));

        // Test

        // Returns a random integer between -50 and 50.
        System.out.println(-50 + (int)(Math.random() * 101));

        // Returns a random integer between -100 and 100.
        System.out.println(-100 + (int)(Math.random() * 201));

        // Returns a random integer between -50 and -1.
        System.out.println(-50 + (int)(Math.random() * 50));


    }
}
