public class Page122 {
    public static void main(String[] args) {

        System.out.println(Math.ceil(2.1));

        System.out.println(Math.floor(-2.1));


        // Test
        System.out.println("test");

        // Giver 2, fordi den runder ned til den nærmeste hele integer
        System.out.println(Math.floor(2.9));

        // Giver 2, fordi 2.4 + 0.5 = 2.9 og den runder ned til den nærmeste hele integer
        System.out.println(Math.round(2.4));

        // Giver 3, fordi 2.5 + 0.5 = 3 og den runder ned til den nærmeste hele integer
        System.out.println(Math.round(2.5));

        // Giver 3, fordi 2.6 + 0.5 = 3.1 og den runder ned til den nærmeste hele integer
        System.out.println(Math.round(2.6));

        // Giver -3, fordi -2.6 + 0.5 = -2.1 og den RUNDER NED til den nærmeste hele integer, dvs. den runder ned til -3
        System.out.println(Math.round(-2.6));

        // Giver -2, fordi -2.5 + 0.5 = -2 og den runder ned til den nærmeste hele integer, hvilket er -2
        System.out.println(Math.round(-2.5));

        // Giver -2, fordi -2.4 + 0.5 = -1.9 og den RUNDER NED til den nærmeste hele integer, hvilket er -2
        System.out.println(Math.round(-2.4));

        // Giver -3, fordi -2.6 + 0.5 = -2.1 og den RUNDER NED til den nærmeste hele integer, dvs. den runder ned til -3
        double x = -2.6;
        long test = (long)Math.floor(x + 0.5);
        System.out.println(test);

    }
}
