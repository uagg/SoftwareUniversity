import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Player firstPlayer = new Player(reader.readLine());
        Player secondPlayer = new Player(reader.readLine());

        Deck deck = new Deck();

        final StringBuilder output = new StringBuilder();

        while (firstPlayer.cardsCount() < 5 || secondPlayer.cardsCount() < 5) {

            try {
                Card card = deck.drawCard(reader.readLine());

                if (firstPlayer.cardsCount() == 5) {
                    secondPlayer.takeCard(card);
                } else {
                    firstPlayer.takeCard(card);
                }
            } catch (IllegalStateException | IllegalArgumentException e) {
                output.append(e.getMessage())
                        .append(System.lineSeparator());
            }
        }

        Player winner = firstPlayer.compareTo(secondPlayer) > 0 ?
                firstPlayer : secondPlayer;

        output.append(String.format("%s wins with %s.",
                winner, winner.getBestCard()));

        System.out.println(output.toString().trim());
    }
}