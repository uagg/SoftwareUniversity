/*
Дадено е цяло число – брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
Да се напише програма, която пресмята бонус точките за това число и общия брой точки с бонусите.
•	Ако числото е до 100 включително, бонус точките са 5.
•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
•	Допълнителни бонус точки (начисляват се отделно от предходните):
o	За четно число  + 1 т.
o	За число, което завършва на 5  + 2 т.

Подсказка:
•	Основните бонус точки можете да изчислите с if-else-if-else-if конструкция (имате 3 случая).
•	Допълнителните бонус точки можете да изчислите с if-else-if конструкция (имате още 2 случая).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        double bonusScore = 0;
        if(number <= 100) {
            bonusScore = 5;
        } else if(number > 100 && number < 1000) {
            bonusScore = number * 0.2;
        } else if(number > 1000) {
            bonusScore = number * 0.1;
        }
        if(number % 2 == 0) {
            bonusScore = bonusScore + 1;
        } else if(number % 10 == 5) {
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(bonusScore + number);
    }
}
