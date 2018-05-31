/*
Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        boolean firstSecond = (first == second);
        boolean secondThird = (second == third);
        if(firstSecond) {
            if(secondThird) {
                System.out.printf("yes");
            } else {
                System.out.printf("no");
            }
        } else {
            System.out.printf("no");
        }
    }
}