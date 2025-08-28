
import java.util.*;

public class Program3 {
    public static int getLength(String s) {
        int count = 0;
        try { while(true){ s.charAt(count); count++; } } catch(Exception e){}
        return count;
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        ArrayList<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else sb.append(ch);
        }
        if (sb.length() > 0) words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] res = wordWithLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : res) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
