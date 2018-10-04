import java.util.Scanner;

public class TestQuiz {
    public static void main(String[] args) {

        String question1 = "What is the name of the capital of Denmark?";
        String answer1 = "Copenhagen";

        Scanner input = new Scanner(System.in);

        System.out.println(question1);
        String playerInput1 = input.nextLine(); // Brug nextLine() i stedet for next()

        int score = 0;

        // Eftersom contains() er case sensitive laves svar og input om til lowercase, så det ikke har betydning om det er lowercase eller uppercase
        answer1 = answer1.toLowerCase();
        playerInput1 = playerInput1.toLowerCase();

        // contains() bruges så man kan skrive hvad som helst og få point, så længe svaret indgår et eller andet sted i det man skriver
        if (playerInput1.contains(answer1)) {
            System.out.println("Correct!");
            ++score;
        }
        else {
            System.out.println("Incorrect!");
            --score;
        }

        System.out.println("Your score is: " + score);



    }
}
