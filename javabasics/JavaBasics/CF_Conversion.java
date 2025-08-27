package JavaBasics;

import java.util.Scanner;

public class CF_Conversion {
    static double converter(double c){
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celcius = sc.nextDouble();
        double convertedToFahrenheit = converter(celcius);

        System.out.println(convertedToFahrenheit);
    }
}
