package JavaBasics;

import java.util.Scanner;

public class SimpleIntrest {
    static double calculateSimpleIntrest(double principal, double rate, double time){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleIntrest = calculateSimpleIntrest(principal, rate, time);

        System.out.println(simpleIntrest);
    }
}
