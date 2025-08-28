import java.util.*;

public class Program1_BMI {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.format("%.2f", bmi), status};
    }

    public static String[][] processBMI(double[][] arr) {
        String[][] result = new String[arr.length][4];
        for (int i = 0; i < arr.length; i++) {
            result[i] = calculateBMI(arr[i][0], arr[i][1]);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            arr[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(arr);
        display(result);
    }
}