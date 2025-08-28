import java.util.*;

public class Program10_DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int idx=0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i=0; i<deck.length; i++) {
            int random = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed.");
            return new String[0][0];
        }
        String[][] res = new String[players][n/players];
        int idx=0;
        for (int i=0; i<players; i++) {
            for (int j=0; j<n/players; j++) {
                res[i][j] = deck[idx++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] res = distribute(deck, n, players);
        for (int i=0; i<res.length; i++) {
            System.out.println("Player " + (i+1) + ": " + Arrays.toString(res[i]));
        }
    }
}