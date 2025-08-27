package Arrays;

import java.util.Scanner;

public class PartialMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store results for 6, 7, 8, 9 (4 results)
        int[] multiplicationResult = new int[4];

        // Calculate and store results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        System.out.println("\n--- Multiplication Table for " + number + " (from 6 to 9) ---");
        // Display the stored results
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        input.close();
    }
}