/*
Да се напише програма, която въвежда две думи и проверява дали са еднакви.
Да не се прави разлика между главни и малки думи. Да се изведе “yes” или “no”.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String lowerWord1 = firstWord.toLowerCase();
        String lowerWord2 = secondWord.toLowerCase();

        if(lowerWord1.equals(lowerWord2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}