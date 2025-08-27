package Arrays;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        // 2D array: [person_index][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            // Input and validate weight
            do {
                System.out.print("Weight in kg: ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) System.out.println("Please enter a positive value for weight.");
            } while (personData[i][0] <= 0);

            // Input and validate height
            do {
                System.out.print("Height in meters: ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) System.out.println("Please enter a positive value for height.");
            } while (personData[i][1] <= 0);

            // Calculate and store BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine and store weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height=%.2fm, Weight=%.1fkg, BMI=%.2f, Status=%s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}