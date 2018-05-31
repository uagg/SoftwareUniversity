/*
Да се напише програма, която въвежда 2*n цели числа и проверява дали сумата на първите n числа (лява сума) е равна
на сумата на вторите n числа (дясна сума). При равенство печата "Yes" + сумата; иначе печата "No" + разликата.
Разликата се изчислява като положително число (по абсолютна стойност).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int leftNumbers = Integer.parseInt(scanner.nextLine());
            leftSum += leftNumbers;
        }
        for (int i = 0; i < n; i++) {
            int rightNumbers = Integer.parseInt(scanner.nextLine());
            rightSum += rightNumbers;
        }
        if(leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else if(leftSum != rightSum) {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}