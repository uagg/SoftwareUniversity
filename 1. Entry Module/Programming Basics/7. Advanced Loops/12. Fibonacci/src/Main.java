/*
Напишете програма, която въвежда цяло число n и пресмята n-тото число на Фибоначи. Нулевото число на Фибоначи е 1,
първото е също 1, а всяко следващо е сумата от предходните две.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int second = 1;
        int next = 0;
        for (int i = 0; i <= n + 1; i++) {
            if(i <= 1) {
                next = i;
            } else {
                next = sum + second;
                sum = second;
                second = next;
            }
            System.out.println(next);
        }
    }
}