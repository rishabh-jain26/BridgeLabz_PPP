import java.util.*;

public class Program2_UniqueChars {
    public static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueChars(String s) {
        int n = stringLength(s);
        char[] result = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] unique = uniqueChars(s);
        System.out.println("Unique characters: " + Arrays.toString(unique));
    }
}