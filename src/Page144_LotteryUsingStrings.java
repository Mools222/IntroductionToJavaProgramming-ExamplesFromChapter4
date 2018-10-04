import java.util.Scanner;

public class Page144_LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random() * 10)
                + (int)(Math.random() * 10);

        // String lottery = "22"; // For testing purposes

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        // Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery))
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");


        // Test - Min løsning

        String lotteryDigit11 = lottery.substring(0, 1);
        String lotteryDigit22 = lottery.substring(1, 2);

        String guessDigit11 = guess.substring(0, 1);
        String guessDigit22 = guess.substring(1, 2);

        if (guess.equals(lottery))
            System.out.println("Exact match: you win $10,000");
        else if (lotteryDigit22.contains(guessDigit11) && lotteryDigit11.contains(guessDigit22)) // Man kan ikke bare skrive "lottery.contains(guessDigit11) && lottery.contains(guessDigit22)". Det ville jo være sandt hvis f.eks. lottery var 21 og guess digits var 22
            System.out.println("Match all digits: you win $3,000");
        else if (lottery.contains(guessDigit11) || lottery.contains(guessDigit22))
            System.out.println("Match one digit: you win $1,000");
         else
            System.out.println("Sorry, no match");



    }
}