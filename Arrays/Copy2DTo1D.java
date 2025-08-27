package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create 1D array
        int[] oneDArray = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("\n--- The 1D array is ---");
        System.out.println(Arrays.toString(oneDArray));

        input.close();
    }
}