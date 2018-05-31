/*
Да се напише програма, която въвежда час и минути от 24-часово денонощие и изчислява колко ще е часът след 15 минути.
Резултатът да се отпечата във формат hh:mm. Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри, с водеща нула когато е необходимо.
Подсказка: добавете 15 минути и направете няколко проверки. Ако минутите надвишат 59,
увеличете часовете с 1 и намалете минутите със 60. По аналогичен начин разгледайте случая, когато часовете надвишат 23.
При печатането на минутите проверете за водеща нула.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes = minutes + 15;
        if(minutes > 59) {
            hour = hour + 1;
            minutes = minutes - 60;
        }
        if(hour > 23) {
            hour = hour - 24;
        }
        if(minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}