import java.util.*;

public class Program6_FreqNested {
    public static String[] freqNested(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        Arrays.fill(freq, -1);
        for (int i = 0; i < chars.length; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }
        String[] result = new String[chars.length];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (freq[i] > 0) {
                result[idx++] = chars[i] + " -> " + freq[i];
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] res = freqNested(s);
        System.out.println("Character Frequency:");
        for (String row : res) System.out.println(row);
    }
}