package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        int maxFactors = 10; // Initial size of the array
        int[] factors = new int[maxFactors];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if the array needs to be resized
                if (index == maxFactors) {
                    // Create a new temporary array with double the size
                    int[] temp = new int[maxFactors * 2];
                    // Copy elements from the old array to the new one
                    for (int j = 0; j < maxFactors; j++) {
                        temp[j] = factors[j];
                    }
                    // Point the original array reference to the new, larger array
                    factors = temp;
                    maxFactors *= 2;
                }
                factors[index] = i;
                index++;
            }
        }

        // Create a final array with the exact size to hold the factors
        int[] finalFactors = Arrays.copyOf(factors, index);

        System.out.println("\nThe factors of " + number + " are: " + Arrays.toString(finalFactors));
        input.close();
    }
}