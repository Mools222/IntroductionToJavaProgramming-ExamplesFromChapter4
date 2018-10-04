import java.util.Scanner;

public class ProgrammingExercises_Page153_4_11_DecimalToHex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        String pasta = "The hex value is ";


        if (decimal >= 10 && decimal <= 15) {
            switch (decimal) {
                case 10:
                    System.out.println(pasta + "A");
                    break;
                case 11:
                    System.out.println(pasta + "B");
                    break;
                case 12:
                    System.out.println(pasta + "C");
                    break;
                case 13:
                    System.out.println(pasta + "D");
                    break;
                case 14:
                    System.out.println(pasta + "E");
                    break;
                case 15:
                    System.out.println(pasta + "F");
            }
        }
        else if (decimal >= 0 && decimal < 10)
            System.out.println(pasta + decimal);
        else
            System.out.println(decimal + " is an invalid input");

        // Worse solution

        switch (decimal) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                System.out.println("F");
                break;
        }
    }
}
