import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardRank = sc.nextLine();
        String cardSuit = sc.nextLine();

        RankAndPower rp = RankAndPower.valueOf(cardRank.toUpperCase());
        SuiteAndPower sp = SuiteAndPower.valueOf(cardSuit.toUpperCase());

        System.out.print("Card name: " + rp.name() + " of " + sp.name() + "; Card power: " + (rp.getMax() + sp.getMax()));
    }
}
