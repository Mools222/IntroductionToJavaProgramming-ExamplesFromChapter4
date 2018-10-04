
import java.util.Scanner;

public class ProgrammingExercises_Page156_4_23_PayrollStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String a = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double b = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double c = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double d = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double e = input.nextDouble();

        double grossPay = b * c;
        double fedTax = grossPay * d;
        double stateTax = grossPay * e;
        double totalDeduction = fedTax + stateTax;
        double netPay = grossPay - totalDeduction;

        // Bare for at gøre det lidt mere overskueligt i consolen
        System.out.println("");

        System.out.printf("Employee Name: %s\nHours Worked: %1.1f\nPay Rate: $%1.2f\nGross Pay: $%1.2f\nDeductions:\n  Federal Withholding (20.0%%): $%1.2f\n  State Withholding (9.0%%): $%1.2f\n  Total Deduction: $%1.2f\nNet Pay: $%1.2f", a, b, c, grossPay, fedTax, stateTax, totalDeduction, netPay);



    }

}
