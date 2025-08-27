package Arrays;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + " (out of 100):");

            System.out.print("Physics: ");
            physics[i] = input.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();
            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            // Validate marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values only. Re-enter for this student.");
                i--; // Decrement to repeat the current student's entry
                continue;
            }

            // Calculate percentage
            double totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = (totalMarks / 300.0) * 100.0;

            // Assign grade
            if (percentages[i] >= 90) grades[i] = "A";
            else if (percentages[i] >= 80) grades[i] = "B";
            else if (percentages[i] >= 70) grades[i] = "C";
            else if (percentages[i] >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("\n--- Student Report Card ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d: Marks(P:%d, C:%d, M:%d) -> Percentage=%.2f%%, Grade=%s%n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        input.close();
    }
}