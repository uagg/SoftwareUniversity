public class Main {
    public static void main(String[] args) {
        CardSuit[] cardSuits = CardSuit.values();

        System.out.println("Card Suits:");

        for (CardSuit suit : cardSuits) {
            System.out.println("Ordinal value: " + suit.ordinal() + "; Name value: " + suit.name());
        }
    }
}
