/*
Да се напише програма, която въвежда цяло число и проверява дали е под 100, между 100 и 200 или над 200.
Подсказка: използвайте if-else-if-else конструкция за да проверите всеки от трите случая.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        if(number <= 99) {
            System.out.println("Less than 100");
        } else if (number >= 100 && number < 201) {
            System.out.println("Between 100 and 200");
        } else if (number >= 201) {
            System.out.println("Greater than 200");
        }
    }
}
