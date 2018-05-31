/*
Напишете програма, която въвежда цяло положително число n и чертае на конзолата квадратна рамка с размер n * n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstLine = "+ " + repeatStr("- ", n - 2) + "+";
        System.out.println(firstLine);
        for (int i = 0; i < n - 2; i++) {
            String midLine = "| " + repeatStr("- ", n - 2) + "|";
            System.out.println(midLine);
        }
        System.out.println(firstLine);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}