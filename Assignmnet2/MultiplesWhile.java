package Assignmnet2;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            int i = 1;
            while (i < 100) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Number must be between 1 and 99");
        }
    }
}