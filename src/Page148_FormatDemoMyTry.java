
public class Page148_FormatDemoMyTry {
    public static void main(String[] args) {

        // Display the header of the table
        System.out.printf("%-20s%-20s\n", "Big numbers", "Big numbers with decimal");

        int bigNumber1 = 1000000000;
        double bigNumberDecimals1 = 1000000000.1111111111111111111111111;
        System.out.printf("%,-20d%,-20.5f\n", bigNumber1, bigNumberDecimals1);


        int bigNumber2 = 2000000000;
        double bigNumberDecimals2 = 2000000000.222222222222222222222222222222;
        System.out.printf("%,-20d%,-20.5f\n", bigNumber2, bigNumberDecimals2);


        int smallNumber0 = 2;
        double smallNumberDecimals0 = 2.222222222222222222222222222222;
        System.out.printf("%-20d%-20.5f\n", smallNumber0, smallNumberDecimals0);


        int smallNumber1 = 2;
        double smallNumberDecimals1 = 2.222222222222222222222222222222;
        System.out.printf("%13d%26.5f\n", smallNumber1, smallNumberDecimals1);


        int smallNumber2 = 2;
        double smallNumberDecimals2 = 2.222222222222222222222222222222;
        System.out.printf("%013d%26.5f\n", smallNumber2, smallNumberDecimals2);

        // Det her giver ikke meget mening - Der er ingen decimaler i "Big numbers"
        int smallNumber3 = 3;
        double smallNumberDecimals3 = 3.33333333333333333333333333;
        System.out.printf("%,13.5f%,26d\n", smallNumberDecimals3, smallNumber3);



    }
}