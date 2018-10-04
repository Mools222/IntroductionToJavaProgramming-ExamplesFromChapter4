import java.util.Scanner;

public class ProgrammingExercises_Page152_4_7_CornerPointCoordinates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();

        double x1 = r * Math.sin(Math.toRadians(72));
        double y1 = r * Math.cos(Math.toRadians(72));

        double x2 = r * Math.sin(Math.toRadians(0));
        double y2 = r * Math.cos(Math.toRadians(0));

        double x3 = r * Math.sin(Math.toRadians(288));
        double y3 = r * Math.cos(Math.toRadians(288));

        double x4 = r * Math.sin(Math.toRadians(144));
        double y4 = r * Math.cos(Math.toRadians(144));

        double x5 = r * Math.sin(Math.toRadians(216));
        double y5 = r * Math.cos(Math.toRadians(216));

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");
        System.out.println("(" + x5 + ", " + y5 + ")");

    }

}
