public class Page129_6_RandomLowercaseLetter {
    public static void main(String[] args) {

        // Write the code that generates a random lowercase letter.


        // a-z går i decimal fra 97 til 122

        char randomLowercaseLetter = (char)(97 + (int)(Math.random() * 26));

        System.out.println(randomLowercaseLetter);


        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));
        System.out.println((char)(97 + (int)(Math.random() * 26)));


        // Officiel løsning
        // Virker ikke???

        System.out.println((int)(Math.random() * 26 + 'a'));

    }
}
