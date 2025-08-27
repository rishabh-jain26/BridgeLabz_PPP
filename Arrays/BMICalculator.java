package Arrays;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Input loop
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Weight in kg: ");
            weights[i] = input.nextDouble();
            System.out.print("Height in meters: ");
            heights[i] = input.nextDouble();
        }

        // Calculation loop
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] <= 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Person %d: Height=%.2fm, Weight=%.1fkg, BMI=%.2f, Status=%s%n",
                    (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }
        input.close();
    }
}