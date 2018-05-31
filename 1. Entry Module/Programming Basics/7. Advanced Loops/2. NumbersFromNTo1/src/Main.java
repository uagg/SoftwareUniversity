/*
Напишете програма, която чете от конзолата цяло число n и печата числата от 1 до 2^n.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}