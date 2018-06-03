public class Main {
    public static void main(String[] args) {
        final Deck deck = new Deck();
        final StringBuilder output = new StringBuilder();

        for (Card card : deck.getCards()) {
            output.append(card)
                    .append(System.lineSeparator());
        }

        System.out.println(output.toString().trim());
    }
}