
import java.util.Scanner;

public class ProgrammingExercises_Page151_4_5_AreaOfRegularPolygon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the hexagon is " + area);

        System.out.printf("The area of the hexagon is %1.2f\n", area);

    }

}
