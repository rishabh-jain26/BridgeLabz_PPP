
import java.util.*;

public class Program4 {
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
                if (sb.length() > 0) { words.add(sb.toString()); sb.setLength(0); }
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

    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < Integer.parseInt(wordLengths[minIdx][1])) minIdx = i;
            if (len > Integer.parseInt(wordLengths[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] res = wordWithLengths(words);
        int[] indices = findShortestAndLongest(res);

        System.out.println("Shortest word: " + res[indices[0]][0]);
        System.out.println("Longest word: " + res[indices[1]][0]);
    }
}
