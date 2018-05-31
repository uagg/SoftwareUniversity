/*
Да се напише програма, която въвежда число n и печата триъгълник от долари.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int r = 0; r < n; r++) {
            System.out.print("$");
            for (int c = 0; c < r ; c++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}