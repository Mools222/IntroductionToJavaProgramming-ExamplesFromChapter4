public class ProgrammingExercises_Page152_4_6_RandomPointsOnCircle {
    public static void main(String[] args) {

        int randomAngleInDegrees1 = (int)(Math.random()* 361);
        int randomAngleInDegrees2 = (int)(Math.random()* 361);
        int randomAngleInDegrees3 = (int)(Math.random()* 361);

        double degreesToRadians1 = Math.toRadians(randomAngleInDegrees1);
        double degreesToRadians2 = Math.toRadians(randomAngleInDegrees2);
        double degreesToRadians3 = Math.toRadians(randomAngleInDegrees3);

        // Radius
        double r = 40;

        double x1 = r * Math.cos(degreesToRadians1);
        double y1 = r * Math.sin(degreesToRadians1);

        double x2 = r * Math.cos(degreesToRadians2);
        double y2 = r * Math.sin(degreesToRadians2);

        double x3 = r * Math.cos(degreesToRadians3);
        double y3 = r * Math.sin(degreesToRadians3);

        // Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        double aa = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double bb = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double cc = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(a);
        System.out.println(aa);
        System.out.println(b);
        System.out.println(bb);
        System.out.println(c);
        System.out.println(cc);

        // Compute three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);

        System.out.printf("The three angles are %1.1f %1.1f %1.1f\n", A, B, C);



    }
}
