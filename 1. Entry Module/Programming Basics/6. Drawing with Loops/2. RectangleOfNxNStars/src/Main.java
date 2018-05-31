/*
Напишете програма, която въвежда цяло положително число n и печата на конзолата правоъгълник от n * n звездички.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text = repeatStr("*", n);
            System.out.println(text);
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}