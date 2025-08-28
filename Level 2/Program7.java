
import java.util.*;

public class Program7 {
    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substringCustom(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        int[] indexes = trimIndexes(text);
        String customTrim = substringCustom(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom Trim: '" + customTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Both equal? " + compareStrings(customTrim, builtInTrim));
    }
}
