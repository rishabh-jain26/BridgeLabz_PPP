import java.util.*;

public class Program3_FirstNonRepeating {
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char c = firstNonRepeating(s);
        if (c == '\0') System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + c);
    }
}