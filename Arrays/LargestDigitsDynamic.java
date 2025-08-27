package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNumber = Math.abs(number); // Handle negative numbers

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract and store digits, resizing the array if necessary
        while (tempNumber > 0) {
            if (index == maxDigit) {
                // Resize the array
                maxDigit += 10; // Increase max size
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index] = (int) (tempNumber % 10);
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