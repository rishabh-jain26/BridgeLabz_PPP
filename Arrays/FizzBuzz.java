package Arrays;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }

        // Array size is number + 1 to include position 0 up to the number
        String[] results = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i > 0 && i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i > 0 && i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i > 0 && i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        input.close();
    }
}