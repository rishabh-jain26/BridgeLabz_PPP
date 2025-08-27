package Assignmnet2;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // formula
            int formulaSum = n * (n + 1) / 2;

            // while loop
            int i = 1, loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}