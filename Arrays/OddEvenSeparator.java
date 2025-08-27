package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Error: Please enter a natural number (1 or greater).");
            input.close();
            return;
        }

        // Create arrays with a safe maximum size
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate and sort numbers into respective arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Create new arrays with the exact size to remove unused zero elements
        int[] finalOddArray = Arrays.copyOf(oddNumbers, oddIndex);
        int[] finalEvenArray = Arrays.copyOf(evenNumbers, evenIndex);


        System.out.println("\n--- Results ---");
        System.out.println("Odd numbers array: " + Arrays.toString(finalOddArray));
        System.out.println("Even numbers array: " + Arrays.toString(finalEvenArray));

        input.close();
    }
}