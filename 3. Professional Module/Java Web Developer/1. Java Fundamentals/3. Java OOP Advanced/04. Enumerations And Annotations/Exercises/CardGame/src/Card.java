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
                "%s of %s",
                this.getRank(), this.getSuit());
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getPower(), other.getPower());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;

        Card card = (Card) other;

        if (this.rank != card.rank) return false;
        return this.suit == card.suit;
    }
}