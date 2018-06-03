import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cr = sc.nextLine();
        String cs = sc.nextLine();

        RankAndPower rankAndPower = RankAndPower.valueOf(cr.toUpperCase());
        SuiteAndPower suiteAndPower = SuiteAndPower.valueOf(cs.toUpperCase());

        Card card = new Card(rankAndPower, suiteAndPower);

        System.out.println(card.toString());
    }
}
