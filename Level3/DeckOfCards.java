import java.util.*;

class DeckOfCards{

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int cardsPerPlayer, int numberOfPlayers) {
        if (cardsPerPlayer * numberOfPlayers > deck.length) {
            System.out.println("Not enough cards in the deck to distribute.");
            return new String[0][0];
        }

        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players.length == 0) {
            System.out.println("No cards were distributed.");
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] deck = initializeDeck();

        shuffleDeck(deck);

        System.out.print("Enter the number of players: ");
        int numberOfPlayers = input.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = input.nextInt();

        String[][] players = distributeCards(deck, cardsPerPlayer, numberOfPlayers);

        printPlayersCards(players);

        input.close();
    }
}