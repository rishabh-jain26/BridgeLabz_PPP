
import java.util.*;

public class Program9 {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        return "comp";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("comp")) compWins++;
            System.out.println("Game " + (i+1) + ": User = " + user + ", Comp = " + comp + " -> Winner: " + winner);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;
        System.out.println("User Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
    }
}
