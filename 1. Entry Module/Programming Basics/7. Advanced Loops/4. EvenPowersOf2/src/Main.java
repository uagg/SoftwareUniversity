/*
Да се напише програма, която въвежда n и печата четните степени на 2 ≤ 2^n: 2^0, 2^2, 2^4, 2^8, …, 2^n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for(int i = 0; i <= n; i+=2) {
            System.out.println(num);
            num = num * 2 * 2;
        }
    }
}