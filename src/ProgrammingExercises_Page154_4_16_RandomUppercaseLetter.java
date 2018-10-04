public class ProgrammingExercises_Page154_4_16_RandomUppercaseLetter {
    public static void main(String[] args) {

        // Generates a random number between 65-90, which corresponds to the decimal numbers for A-Z
        int randomNumber = (int)(65 + (Math.random() * 26));

        char randomLetter = (char)randomNumber;

        System.out.println(randomLetter);

    }
}
