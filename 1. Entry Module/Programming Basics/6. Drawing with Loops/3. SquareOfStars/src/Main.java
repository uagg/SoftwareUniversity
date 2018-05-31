/*
Напишете програма, която чете от конзолата число n и чертае квадрат от n * n звездички. Разликата с предходната задача
е, че между всеки две звездички има по един интервал.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int r = 0; r < n; r++) {
            System.out.print("*");
            for (int c = 0; c < n - 1; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}