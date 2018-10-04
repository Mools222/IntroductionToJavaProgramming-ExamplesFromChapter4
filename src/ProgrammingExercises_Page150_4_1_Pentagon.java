import java.util.Scanner;

public class ProgrammingExercises_Page150_4_1_Pentagon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin((Math.PI / 5));

        System.out.println(s);

        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %1.2f\n", area);



        // Test - it automatically rounds up

        double test1 = 50.144;
        double test2 = 50.145;

        System.out.printf("Does it round up test: %1.2f\n", test1);
        System.out.printf("Does it round up test: %1.2f\n", test2);
    }

}
