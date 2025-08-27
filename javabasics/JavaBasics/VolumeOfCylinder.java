package JavaBasics;

import java.util.Scanner;
import java.lang.Math;

public class VolumeOfCylinder {
    static double CylinderVolume(double height, double baseRadius){
        return Math.PI * Math.pow(baseRadius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseRadius = sc.nextDouble();
        double height = sc.nextDouble();
        double volumeOfCylinder = CylinderVolume(height, baseRadius);

        System.out.println(volumeOfCylinder);
    }
}
