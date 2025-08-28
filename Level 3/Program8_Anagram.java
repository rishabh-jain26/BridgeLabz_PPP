import java.util.*;

public class Program8_Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("Are anagrams? " + isAnagram(s1, s2));
    }
}