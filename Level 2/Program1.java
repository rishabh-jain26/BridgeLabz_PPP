
import java.util.*;

public class Program1 {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}
