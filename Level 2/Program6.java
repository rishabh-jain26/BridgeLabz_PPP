
import java.util.*;

public class Program6 {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyChars(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = checkCharType(s.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Char\tType");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String[][] res = classifyChars(text);
        displayTable(res);
    }
}
