/*
Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50). Да се напише програма,
която въвежда времената на състезателите и пресмята сумарното им време във формат "минути:секунди".
Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
Подсказка:
•	Сумирайте трите числа и получете резултата в секунди. Понеже 1 минута = 60 секунди,
ще трябва да изчислите броя минути и броя секунди в диапазона от 0 до 59.
•	Ако резултатът е между 0 и 59, отпечатайте 0 минути + изчислените секунди.
•	Ако резултатът е между 60 и 119, отпечатайте 1 минута + изчислените секунди минус 60.
•	Ако резултатът е между 120 и 179, отпечатайте 2 минути + изчислените секунди минус 120.
•	Ако секундите са по-малко от 10, изведете водеща нула преди тях.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int sum = sec1 + sec2 + sec3;
        int minutes = sum / 60;
        int seconds = sum % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
