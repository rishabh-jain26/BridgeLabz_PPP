package Arrays;

import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to hold employee data
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("--- Enter Data for 10 Employees ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            System.out.print("Enter years of service: ");
            double years = input.nextDouble();

            // Input validation
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Salary and years of service cannot be negative. Please enter data for this employee again.");
                i--; // Decrement counter to re-enter data for the same employee index
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Loop to calculate bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update total counters
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Zara Company Payroll Summary ---");
        System.out.printf("Total Old Salary Payout: $%.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: $%.2f%n", totalBonus);
        System.out.printf("Total New Salary Payout: $%.2f%n", totalNewSalary);

        input.close();
    }
}