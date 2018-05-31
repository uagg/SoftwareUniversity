/*
Напишете програма, която въвежда число n (1 ≤ n ≤ 100) и печата коледна елха с размер n.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int spaceCount = n;
        for (int i = 0; i < n + 1; i++) {
            String stars = repeatStr("*", i);
            String spaces = repeatStr(" ", spaceCount);
            spaceCount--;
            System.out.println(spaces + stars + " | " + stars + spaces);
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