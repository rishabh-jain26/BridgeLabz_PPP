package Arrays;

import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // 2D array: [student_index][0=Physics, 1=Chemistry, 2=Maths]
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + " (out of 100):");
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Re-enter for this student.");
                i--;
                continue;
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100.0;

            if (percentages[i] >= 90) grades[i] = "A";
            else if (percentages[i] >= 80) grades[i] = "B";
            else if (percentages[i] >= 70) grades[i] = "C";
            else if (percentages[i] >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("\n--- Student Report Card ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d: Marks(P:%d, C:%d, M:%d) -> Percentage=%.2f%%, Grade=%s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        input.close();
    }
}