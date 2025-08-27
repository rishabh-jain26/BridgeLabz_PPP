package Arrays;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop.");

        while (true) {
            // Break if the array is full
            if (index == 10) {
                System.out.println("Maximum number of entries (10) reached.");
                break;
            }

            System.out.print("Enter a number: ");
            double entry = input.nextDouble();

            // Break if the user enters 0 or a negative number
            if (entry <= 0) {
                break;
            }

            numbers[index] = entry;
            index++;
        }

        System.out.println("\n--- Numbers Entered ---");
        // Loop up to the actual number of entries to display and sum them
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);
        input.close();
    }
}