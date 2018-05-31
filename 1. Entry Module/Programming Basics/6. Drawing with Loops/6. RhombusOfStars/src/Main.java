/*
Напишете програма, която въвежда цяло положително число n и печата ромбче от звездички с размер n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int r = 1; r <= n; r++) {
            for (int i = n; i > r; i--) {
                System.out.print(" ");
            }
            for (int c = 0; c < r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = n - 1; r > 0 ; r--) {
            String line = "";
            for (int i = n; i > r; i--) {
                line += " ";
            }
            for (int c = 0; c < r; c++) {
                line += "* ";
            }
            System.out.println(line);
        }
    }
}