/*
You are given a sequence of people and for every person the cards he draws from the deck. The input will be on separate
lines in the format: {personName}: {PT, PT, PT, … PT}, where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of
the card and T (S, H, D, C) is the type. The input ends when a "JOKER" is drawn.
The name can contain any ASCII symbol except ':'
A single person cannot have more than one card with the same power and type, if he draws such a card he discards it.
The people are playing with multiple decks. Each card has a value that is calculated by the power multiplied by the type.
Powers 2 to 10 have the same value and J to A are 11 to 14. Types are mapped to multipliers the following way
(S -> 4, H-> 3, D -> 2, C -> 1).
Finally print out the total value each player has in his hand in the format:  {personName}: {value}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, HashSet<String>> players = new LinkedHashMap<>();

        enterPlayersAndCards(bf, players);
        for (Map.Entry<String, HashSet<String>> player : players.entrySet()) {
            String name = player.getKey();
            Set<String> playerCards = player.getValue();

            int sumCardPoints = 0;
            for (String playerCard : playerCards) {
                sumCardPoints += calcCardValue(playerCard);
            }

            System.out.printf("%s: %d%n", name, sumCardPoints);
        }

        System.out.println();
    }

    private static void enterPlayersAndCards(BufferedReader bf, Map<String, HashSet<String>> players) throws IOException {
        while (true) {
            String[] line = bf.readLine().split(":\\s+");

            if ("JOKER".equalsIgnoreCase(line[0])) {
                break;
            }

            String playerName = line[0];
            String[] cards = line[1].split(",\\s+");

            if (!players.containsKey(playerName)) {
                players.put(playerName, new HashSet<>());
            }

            HashSet<String> cardsDistinct = new HashSet<>(players.get(playerName));
            cardsDistinct.addAll(Arrays.asList(cards));
            players.put(playerName, cardsDistinct);
        }
    }

    private static int calcCardValue(String card) {
        Map<String, Integer> cardPower = new HashMap<>();
        Map<String, Integer> cardType = new HashMap<>();

        for (int i = 2; i <= 10; i++) {
            cardPower.put(Integer.toString(i), i);
        }

        cardPower.put("J", 11);
        cardPower.put("Q", 12);
        cardPower.put("K", 13);
        cardPower.put("A", 14);

        cardType.put("C", 1);
        cardType.put("D", 2);
        cardType.put("H", 3);
        cardType.put("S", 4);

        String currentCardPower = card.substring(0, card.length() - 1);
        String currentCardType = card.substring(card.length() - 1);
        int currentCardPoints = cardPower.get(currentCardPower) * cardType.get(currentCardType);

        return currentCardPoints;
    }
}