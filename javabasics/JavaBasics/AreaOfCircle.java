package JavaBasics;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    static float areaOfCircle(float radius){
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float area = areaOfCircle(radius);

        System.out.println(area);
    }
}
