
import java.util.*;

public class Program10 {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculate(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] calculateGrade(double[][] calc) {
        String[] grades = new String[calc.length];
        for (int i = 0; i < calc.length; i++) {
            double perc = calc[i][2];
            if (perc >= 90) grades[i] = "A";
            else if (perc >= 75) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 40) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] calc, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                               (int)calc[i][0] + "\t" + String.format("%.2f", calc[i][1]) + "\t" +
                               calc[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] calc = calculate(scores);
        String[] grades = calculateGrade(calc);
        display(scores, calc, grades);
    }
}
