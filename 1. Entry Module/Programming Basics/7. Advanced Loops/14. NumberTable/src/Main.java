/*
Напишете програма, която въвежда цяло число n и отпечатва таблица (матрица) от числа.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int save = col + row + 1;
                if(save > n) {
                    save = 2 * n - save;
                }
                System.out.print(save + " ");
            }
            System.out.println();
        }
    }
}