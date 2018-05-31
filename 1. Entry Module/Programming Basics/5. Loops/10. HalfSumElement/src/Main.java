/*
Да се напише програма, която въвежда n цели числа и проверява дали сред тях съществува число, което е равно
на сумата на всички останали. Ако има такъв елемент, печата "Yes" + неговата стойност; иначе печата "No" +
разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number > max) {
                max = number;
            }
            sum += number;
        }
        int yes = sum - max;
        int diff = Math.abs(max - yes);
        if((sum - max) == max) {
            System.out.printf("Yes Sum = %d", yes);
        } else if((sum - max) != max) {
            System.out.printf("No Diff = %d", diff);
        }
    }
}