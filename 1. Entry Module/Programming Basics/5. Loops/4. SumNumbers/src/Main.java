/*
Да се напише програма, която въвежда n цели числа и ги сумира.
•	От първия ред на входа се въвежда броят числа n.
•	От следващите n реда се въвежда по едно цяло число.
Програмата трябва да прочете числата, да ги сумира и да отпечата сумата им.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            sum += currNum;
        }
        System.out.println(sum);
    }
}