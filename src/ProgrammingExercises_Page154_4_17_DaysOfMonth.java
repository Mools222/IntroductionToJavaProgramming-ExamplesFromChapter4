import java.util.Scanner;

public class ProgrammingExercises_Page154_4_17_DaysOfMonth {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Check if the year is a leap year
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        String months28Or29Days = "Feb";
        String months30Days = "AprJunSepNov";
        String months31Days = "JanMarMayJulAugOctDec";

        String a = " has 31 days";
        String b = " has 30 days";

        if (leapYear && (months28Or29Days.contains(month)))
            System.out.println(month + " " + year + " has 29 days");
        else if ((months28Or29Days.contains(month)))
            System.out.println(month + " " + year + " has 28 days");
        else if ((months30Days.contains(month)))
            System.out.println(month + " " + year + b);
        else if ((months31Days.contains(month)))
            System.out.println(month + " " + year + a);

    }

}
