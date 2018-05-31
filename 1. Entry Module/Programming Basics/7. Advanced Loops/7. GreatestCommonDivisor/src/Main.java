/*
Напишете програма, която въвежда две цели положителни числа a и b и изчислява и отпечатва най-големият им общ делител (НОД).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int biggerNumber = Math.max(a,b);

        while(a % biggerNumber != 0 || b % biggerNumber != 0) {
            biggerNumber--;
        }
        System.out.println(biggerNumber);
    }
}