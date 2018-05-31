/*
Да се напише програма, която въвежда n цели числа и проверява дали сумата от числата на четни позиции е равна
на сумата на числата на нечетни позиции. При равенство да се отпечата "Yes" + сумата; иначе да се отпечата "No"
+ разликата. Разликата се изчислява по абсолютна стойност.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                oddSum += Integer.parseInt(scanner.nextLine());
            } else {
                evenSum += Integer.parseInt(scanner.nextLine());
            }
        }
        if(oddSum == evenSum) {
            System.out.printf("Yes Sum = %d", oddSum);
        } else if(oddSum != evenSum) {
            System.out.printf("no Diff = %d", Math.abs(oddSum - evenSum));
        }
    }
}