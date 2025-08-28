import java.util.*;

public class Program7_Palindrome {
    public static boolean isPalindrome1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindrome2(s, i + 1, j - 1);
    }

    public static boolean isPalindrome3(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = s.charAt(arr.length - 1 - i);
        return Arrays.equals(arr, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Logic 1: " + isPalindrome1(s));
        System.out.println("Logic 2: " + isPalindrome2(s, 0, s.length()-1));
        System.out.println("Logic 3: " + isPalindrome3(s));
    }
}