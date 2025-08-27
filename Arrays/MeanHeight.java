package Arrays;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height for each of the 11 players:");

        // Get heights and calculate sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean
        double mean = sum / heights.length;

        System.out.println("\n--- Result ---");
        System.out.printf("The mean height of the football team is: %.2f%n", mean);
        input.close();
    }
}