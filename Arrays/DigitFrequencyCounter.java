package Arrays;

import java.util.Scanner;

public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNumber = Math.abs(number); // Work with a positive version

        // frequency[0] will store count of 0s, frequency[1] for 1s, etc.
        int[] frequency = new int[10];

        // Special case for number 0
        if (tempNumber == 0) {
            frequency[0] = 1;
        }

        // Loop through the number to count digits
        while (tempNumber > 0) {
            int digit = (int) (tempNumber % 10); // Get the last digit
            frequency[digit]++;                  // Increment its frequency count
            tempNumber /= 10;                    // Remove the last digit
        }

        System.out.println("\n--- Digit Frequency Report for " + number + " ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of digit " + i + ": " + frequency[i]);
            }
        }
        input.close();
    }
}