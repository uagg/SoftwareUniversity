/*
Напишете програма, която въвежда цяло положително число n и печата числата от n до 1 в обратен ред
(от най-голямото към най-малкото).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
}