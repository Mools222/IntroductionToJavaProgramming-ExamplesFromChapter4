public class ProgrammingExercises_Page156_4_25_VehiclePlateNumbers {
    public static void main(String[] args) {

        // Three uppercase letters

        // Generates a random number between 65-90, which corresponds to the decimal numbers for A-Z + Casts it as char
        // Man behøver åbenbart ikke at caste den som int først
        char randomLetter1 = (char)(65 + (Math.random() * 26));
        char randomLetter2 = (char)(65 + (Math.random() * 26));
        char randomLetter3 = (char)(65 + (Math.random() * 26));

        // Four digits
        int randomDigit1 = (int)(Math.random() * 10);
        int randomDigit2 = (int)(Math.random() * 10);
        int randomDigit3 = (int)(Math.random() * 10);
        int randomDigit4 = (int)(Math.random() * 10);

        System.out.println(randomLetter1 + "" + randomLetter2 + "" + randomLetter3 + "" + randomDigit1 + "" + randomDigit2 + "" + randomDigit3 + "" + randomDigit4);

    }
}
