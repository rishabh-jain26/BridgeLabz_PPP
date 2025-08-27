package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumberWithArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        long number = input.nextLong();

        // Count digits by converting the number to a string
        String numStr = String.valueOf(Math.abs(number));
        int digitCount = numStr.length();
        int[] digits = new int[digitCount];

        // Store digits in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        // Create a new array to store the reversed digits
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        System.out.println("\nOriginal digits array: " + Arrays.toString(digits));
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println(); // For a new line at the end
        input.close();
    }
}