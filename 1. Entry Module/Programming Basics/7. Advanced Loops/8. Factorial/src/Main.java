/*
Напишете програма, която въвежда цяло число n (1 ≤ n ≤ 12) и изчислява и отпечатва n! = 1 * 2 * … * n (n факториел).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = Integer.parseInt(scanner.nextLine());
        long factorial = 1;
        do {
            factorial = factorial * a;
            a--;
        } while(a > 0);
        System.out.println(factorial);
    }
}