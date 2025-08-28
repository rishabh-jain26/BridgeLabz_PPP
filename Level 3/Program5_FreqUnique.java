import java.util.*;

public class Program5_FreqUnique {
    public static char[] uniqueChars(String s) {
        char[] result = new char[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result[idx++] = c;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public static String[][] freqUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[][] res = freqUnique(s);
        System.out.println("Character Frequency:");
        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}