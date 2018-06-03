import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Deck {

    private final List<String> validCards;

    private Map<String, Card> cardsToDraw;

    public Deck() {
        this.setCardsToDraw();
        this.validCards = new ArrayList<>(this.cardsToDraw.keySet());
    }

    public Iterable<Card> getCards() {
        return this.cardsToDraw.values();
    }

    public Card drawCard(String cardName) {
        if (! this.validCards.contains(cardName)) {
            throw new IllegalArgumentException("No such card exists.");
        }

        if (! this.cardsToDraw.containsKey(cardName)) {
            throw new IllegalStateException("Card is not in the deck.");
        }

        return this.cardsToDraw.remove(cardName);
    }

    private void setCardsToDraw() {
        this.cardsToDraw = new LinkedHashMap<>();

        for (CardSuit cardSuit : CardSuit.values()) {
            for (CardRank cardRank : CardRank.values()) {
                Card card = new Card(cardRank, cardSuit);
                this.cardsToDraw.put(card.toString(), card);
            }
        }
    }
}