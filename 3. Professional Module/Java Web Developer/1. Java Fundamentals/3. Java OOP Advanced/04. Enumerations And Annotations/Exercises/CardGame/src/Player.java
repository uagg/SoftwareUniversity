import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {

    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void takeCard(Card card) {
        this.cards.add(card);
    }

    public int cardsCount() {
        return this.cards.size();
    }

    @Override
    public int compareTo(Player other) {
        int playerCardPower = this.getBestCard().getPower();
        int otherCardPower = other.getBestCard().getPower();

        return playerCardPower - otherCardPower;
    }

    public Card getBestCard() {
        Card best = this.cards.get(0);

        for (Card card : this.cards) {
            if (card.getPower() > best.getPower()) {
                best = card;
            }
        }

        return best;
    }

    @Override
    public String toString() {
        return this.name;
    }
}