package Assignmnet2;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start number: ");
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}