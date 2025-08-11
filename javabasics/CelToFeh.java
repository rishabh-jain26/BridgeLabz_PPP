package BridgeLabz_PPP.javabasics;
import java.util.Scanner;
public class CelToFeh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.print(fahrenheit);
    }
}