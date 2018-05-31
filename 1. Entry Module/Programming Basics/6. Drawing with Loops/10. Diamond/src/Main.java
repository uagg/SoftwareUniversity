/*
Напишете програма, която въвежда цяло число n (1 ≤ n ≤ 100) и печата диамант с размер n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sidedashCount = (n - 1) / 2;
        int centerDashCount = 0;
        for (int i = 0; i < n / 2 + n % 2; i++) {
            String sideDashes = repeatStr("-", sidedashCount);
            centerDashCount = n - 2 - 2 * sidedashCount;
            String centerDashes = "";
            if(centerDashCount > 0) {
                centerDashes = repeatStr("-", centerDashCount);
            }
            if((i == 0 || i == n - 1) && n % 2 != 0) {
                System.out.println(sideDashes + "*" + sideDashes);
            } else {
                System.out.println(sideDashes + "*" + centerDashes + "*" + sideDashes);
            }
            sidedashCount--;
        }
        sidedashCount += 2;
        for (int i = 0; i < n / 2 + n % 2 - 1; i++) {
            String sideDashes = repeatStr("-", sidedashCount);
            String centerDashes = "";
            centerDashCount = n - 2 - 2 * sidedashCount;
            if(centerDashCount > 0) {
                centerDashes = repeatStr("-", centerDashCount);
            }
            if(i == n / 2 + n % 2 - 2 && n % 2 != 0) {
                System.out.println(sideDashes + "*" + sideDashes);
            } else {
                System.out.println(sideDashes + "*" + centerDashes + "*" + sideDashes);
            }
            sidedashCount++;
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