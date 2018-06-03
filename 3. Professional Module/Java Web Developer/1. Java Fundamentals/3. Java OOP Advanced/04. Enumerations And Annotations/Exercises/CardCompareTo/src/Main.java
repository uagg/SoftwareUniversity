import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first card
        String cr1 = sc.nextLine();
        String cs1 = sc.nextLine();

        // Input for second card
        String cr2 = sc.nextLine();
        String cs2 = sc.nextLine();

        // First card configuration
        RankAndPower rankAndPower1 = RankAndPower.valueOf(cr1.toUpperCase());
        SuiteAndPower suiteAndPower1 = SuiteAndPower.valueOf(cs1.toUpperCase());

        // Second card configuration
        RankAndPower rankAndPower2 = RankAndPower.valueOf(cr2.toUpperCase());
        SuiteAndPower suiteAndPower2 = SuiteAndPower.valueOf(cs2.toUpperCase());

        Card firstCard = new Card(rankAndPower1, suiteAndPower1);
        Card secondCard = new Card(rankAndPower2, suiteAndPower2);

        Card greater = firstCard.compareTo(secondCard) > 0 ? firstCard : secondCard;

        System.out.println(greater);
    }
}
