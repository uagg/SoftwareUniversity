/*
Дадено число е валидно, ако е в диапазона [100…200] или е 0. Да се напише програма, която въвежда цяло число и печата
„invalid“ ако въведеното число не е валидно.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if((number >= 100) && (number <= 200) || (number == 0)) {
            System.out.println("");
        } else {
            System.out.println("invalid");
        }
    }
}