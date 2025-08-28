
import java.util.Scanner;

public class ToLowerCaseCompare {
    public static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = customToLowerCase(text);
        String builtin = text.toLowerCase();

        System.out.println("Custom toLowerCase: " + custom);
        System.out.println("Built-in toLowerCase: " + builtin);
        System.out.println("Comparison: " + compareUsingCharAt(custom, builtin));
    }
}
