public class Card {

    private SuiteAndPower cardSuit;
    private RankAndPower cardRank;

    public Card(RankAndPower rp, SuiteAndPower sp) {
        this.cardRank = rp;
        this.cardSuit = sp;
    }

    private RankAndPower getRank() {
        return this.cardRank;
    }

    private SuiteAndPower getSuit() {
        return this.cardSuit;
    }

    private int getPower() {
        return this.cardRank.getMax() + this.cardSuit.getMax();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %s",
                this.getRank(), this.getSuit(), this.getPower());
    }
}
