/*
Напишете програма, която въвежда цяло положително число n в диапазона [1…100].
При въвеждане на число извън посочения диапазон, да се отпечата съобщение за грешка и потребителят да се подкани да
въведе ново число
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Еnter a number in the range [1...100]: ");
        int number = Integer.parseInt(sc.nextLine());

        boolean isValid = true;

        while(isValid) {
            if (number >= 1 && number <= 100) {
                isValid = false;
                System.out.println("The number is: " + number);
            } else {
                System.out.println("Invalid number!");
                System.out.print("Еnter a number in the range [1...100]: ");
                number = Integer.parseInt(sc.nextLine());
            }
        }
    }
}
