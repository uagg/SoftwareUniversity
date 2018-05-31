/*
Напишете програма, която въвежда число n и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
Всяко следващо число се изчислява като предишното число * 2 + 1.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i = i * 2 + 1) {
            System.out.println(i);
        }
    }
}