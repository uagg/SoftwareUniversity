/*
Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();
        double price = 0;
        if((n < 20) && (dayNight.equals("day"))) {
            price = 0.7 + (0.79 * n);
        } else if((n < 20) && (dayNight.equals("night"))){
            price = 0.7 + (0.90 * n);
        }

        if((n >= 20) && (n < 100) && (dayNight.equals("day"))) {
            price = 0.09 * n;
        } else if((n >= 20) && (n < 100) && (dayNight.equals("night"))) {
            price = 0.09 * n;
        }
        if((n >= 100) && (dayNight.equals("day"))) {
            price = 0.06 * n;
        } else if((n >= 100) && (dayNight.equals("night"))) {
            price = 0.06 * n;
        }
        System.out.printf("%.2f", price);
    }
}