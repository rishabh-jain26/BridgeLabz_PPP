import java.util.*;

public class Program4_FreqChars {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        String[][] result = new String[s.length()][2];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[][] res = frequency(s);
        System.out.println("Character Frequency:");
        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}