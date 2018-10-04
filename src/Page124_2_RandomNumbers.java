public class Page124_2_RandomNumbers {
    public static void main(String[] args) {

        double x = Math.toRadians(47);
        System.out.println(x);

        // Next

        double y = Math.toDegrees(Math.PI / 7);
        System.out.println(y);

        // Next

        // Roller mellem 34 og 54
        double r1 = 34 + (int)(Math.random() * 21);

        // Hvis det skulle være mellem 34 og 55, som der står i opgaven:
        double r1x = 34 + (int)(Math.random() * 22);

        // Roller mellem 0 og 999
        double r2 = (int)(Math.random() * 1000);

        // Roller mellem 5.5 og 55.49999 (jeg tror det er 15-16 9-taller)
        double r3 = 5.5 + (Math.random() * 50);

        // Hvis det skulle være mellem 5.5 og 55.5, som der står i opgaven - Jeg ved faktisk ikke hvordan man skal lave det - Den her kan godt rolle lidt over 55.5
        double r3x = 5.5 + (Math.random() * 50.01);


        System.out.println(r1);
        System.out.println(r1x);

        System.out.println("space");

        System.out.println(r2);

        System.out.println("space");

        System.out.println(r3);

        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));
        System.out.println(5.5 + (Math.random() * 50.00000000000006));

        System.out.println("s");

        System.out.println(50 / 0.9999999999999999);
        System.out.println(50.00000000000001 * 0.9999999999999999);
        System.out.println(55.5 * 0.9999999999999999);
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());



    }
}
