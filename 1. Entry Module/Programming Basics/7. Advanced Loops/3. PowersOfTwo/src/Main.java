/*
Да се напише програма, която въвежда n и печата четните степени на 2 ≤ 2n: 2^0, 2^2, 2^4, 2^8, …, 2^n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        for (int i = 0; i <= n; i++) {
            if(i == 0) {
                System.out.println(number);
            } else if(i > 0)  {
                number *=2;
                System.out.println(number);
            }
        }
    }
}