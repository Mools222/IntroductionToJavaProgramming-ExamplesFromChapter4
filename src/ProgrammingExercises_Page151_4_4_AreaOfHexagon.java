import java.util.Scanner;

public class ProgrammingExercises_Page151_4_4_AreaOfHexagon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + area);

        System.out.printf("The area of the hexagon is %1.2f\n", area);

    }

}
