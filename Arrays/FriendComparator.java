package Arrays;

import java.util.Scanner;

public class FriendComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (in meters): ");
            heights[i] = input.nextDouble();
        }

        int youngestAge = ages[0];
        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        // Loop to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            // Check for youngest
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
            // Check for tallest
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + "m)");

        input.close();
    }
}