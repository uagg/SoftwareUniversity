/*
Напишете програма, която въвежда цяло число n и проверява дали е просто число (дали се дели само на себе си и на единица).
Да се отпечата “Prime” или “Not prime”.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sq = (int) Math.sqrt(number);
        boolean isPrime = false;
        if(number > 1) {
            if(number != 10) {
                for (int i = 2; i <= sq; i++) {
                    if(number % i != 0) {
                        isPrime = true;
                    } else {
                        isPrime = false;
                    }
                }
                if(isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            } else {
                System.out.println("Not Prime");
            }
        } else {
            System.out.println("Not Prime");
        }
    }
}