import java.util.Scanner;

public class ProgrammingExercises_Page155_4_18_StudentMajorAndStatus {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String majorAndStatus = input.next();

        // Man kan ikke bare skrive if(!"MCI".contains(majorAndStatus) || !"1234".contains(majorAndStatus)) eller if(!"MCI1234".contains(majorAndStatus))

        if(!majorAndStatus.contains("M") && !majorAndStatus.contains("C") && !majorAndStatus.contains("I") ||
                !majorAndStatus.contains("1") && !majorAndStatus.contains("2") && !majorAndStatus.contains("3") && !majorAndStatus.contains("4"))
            System.out.println("Invalid input");
        else {
            if (majorAndStatus.contains("M"))
                System.out.print("Mathematics ");
            else if (majorAndStatus.contains("C"))
                System.out.print("Computer Science ");
            else if (majorAndStatus.contains("I"))
                System.out.print("Information Technology ");

            if (majorAndStatus.contains("1"))
                System.out.print("Freshman");
            else if (majorAndStatus.contains("2"))
                System.out.print("Sophomore");
            else if (majorAndStatus.contains("3"))
                System.out.print("Junior");
            else if (majorAndStatus.contains("4"))
                System.out.print("Senior");
        }


    }

}
