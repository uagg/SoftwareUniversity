public class Card implements Comparable<Card> {

    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return this.rank;
    }

    public CardSuit getSuit() {
        return this.suit;
    }

    public int getPower() {
        return this.suit.getPower() + this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format(
                "Card name: %s of %s; Card power: %s",
                this.getRank(), this.getSuit(), this.getPower());
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getPower(), other.getPower());
    }
}