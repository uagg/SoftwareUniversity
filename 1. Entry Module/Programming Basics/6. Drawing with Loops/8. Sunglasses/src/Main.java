/*
Напишете програма, която въвежда цяло число n (3 ≤ n ≤ 100) и печата слънчеви очила с размер 5*n x n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstRowStars = repeatStr("*", n * 2);
        String spaces = repeatStr(" ", n);
        String firstAndLastRow = firstRowStars + spaces + firstRowStars;
        System.out.println(firstAndLastRow);
        for (int r = 0; r < n - 2; r++) {
            String slashes = repeatStr("/", n * 2 - 2);
            if(r == (n - 1) / 2 - 1) {
                String pipes = repeatStr("|", n);
                System.out.println("*" + slashes + "*" + pipes + "*" + slashes + "*");
            } else {
                System.out.println("*" + slashes + "*" + spaces + "*" + slashes + "*");
            }
        }
        System.out.println(firstAndLastRow);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}