/*
Да се напише програма, която въвежда две цели числа и отпечатва по-голямото от двете.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scan.nextLine());
        double secondNumber = Double.parseDouble(scan.nextLine());
        if(firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
