/*
Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between 1
and 20, which, if added or subtracted, result in the target.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            int number = 0;
            int result = 0;

            if (i < target) {
                number = target - i;
                result = number + i;
                if (number <= 20 && i != target) {
                    System.out.printf("%d + %d = %d\n", i, number, result);
                }
            } else {
                number = i - target;
                result = i - number;
                if (number <= 20 && i != target) {
                    System.out.printf("%d - %d = %d\n", i, number, result);
                }
            }
        }
    }
}
