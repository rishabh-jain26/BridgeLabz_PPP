package BridgeLabz_PPP.javabasics;
import java.util.Scanner;
public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.print(volume);
    }
}