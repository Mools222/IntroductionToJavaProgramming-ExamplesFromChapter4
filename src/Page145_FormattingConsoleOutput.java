public class Page145_FormattingConsoleOutput {
    public static void main(String[] args) {

        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $" + interest);

        System.out.println("Interest is $" + (int)(interest * 100) / 100.0);

        System.out.printf("Interest is $%4.2f", interest); // Det ser ikke ud til at det forandrer noget at ændre "$%4.2f" til fx "$%1.2f" - Det er fordi "16.40" er 5 characters lang. Hvis man skriver "$%6.2f" kommer det et mellemrum før "16.40"


        // Linjeskift fordi printf ikke laver linjeskift - Gotta use \n
        System.out.println("");

        // Next

        int count = 5;
        double amount2 = 45.56;
        System.out.printf("count is %d and amount2 is %f", count, amount2);

        System.out.println("");

        // Test

        int test1 = 1343;
        System.out.printf("Test1 is %5d", test1);

        System.out.println("");

        int test2 = 134345664;
        System.out.printf("Test2 is %5d", test2);

        System.out.println("");

        double test3 = 13848.36543543; // Makes 2 spaces before the numbers, because ".37" is 3 characters, leaving 7 out of the width of 10. 10 - 3 = 7. "13848" is 5 characters. 7 - 5 = 2
        System.out.printf("Test3 is %10.2f", test3);

        System.out.println("");

        double test4 = 1388494.36543543;
        System.out.printf("Test4 is %10.2f", test4);

        System.out.println("");

        // Next

        System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);

        // Next

        System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63); // 4 mellemrum før 1234. 4 mellemrum før Java. 5 mellemrum før 5.6
        System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);

        // Test %%

        int z = 100;
        System.out.printf("10%% of %d is 10\n", z);




    }
}
