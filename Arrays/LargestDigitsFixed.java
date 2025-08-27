package Arrays;

import java.util.Scanner;

public class LargestDigitsFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNumber = number; // Use a temporary variable to not alter the original

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract and store digits
        while (tempNumber != 0) {
            if (index == maxDigit) {
                System.out.println("Warning: Array is full. Not all digits have been stored.");
                break;
            }
            // Get the last digit
            digits[index] = (int) (tempNumber % 10);
            // Remove the last digit
            tempNumber /= 10;
            index++;
        }

        // Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Largest digit is: " + largest);
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Second largest digit is: " + secondLargest);
        }
        input.close();
    }
}