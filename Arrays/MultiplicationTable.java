package Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        int[] multiplicationResults = new int[10];

        // Calculate and store the results
        for (int i = 1; i <= 10; i++) {
            multiplicationResults[i - 1] = number * i;
        }

        System.out.println("\n--- Multiplication Table for " + number + " ---");
        // Display the results from the array
        for (int i = 0; i < multiplicationResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }
        input.close();
    }
}