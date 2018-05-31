/*
Напишете програма, която въвежда четно число. Ако потребителят въведе грешно число (нечетно число или стринг,
който не е цяло число), трябва да му излиза съобщение за грешка и да въвежда отново.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1;

        while(true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 != 0) {
                    System.out.println("Invalid number!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println(n);
    }
}