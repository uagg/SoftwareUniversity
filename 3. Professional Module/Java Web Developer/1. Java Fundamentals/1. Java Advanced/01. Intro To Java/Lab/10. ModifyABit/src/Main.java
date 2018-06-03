/*
We are given a positive integer number n, a position p and a bit value v (v=0 or 1). Write a program that modifies n
to hold the value v at the position p from the binary representation of n while preserving all other bits in n.
Print the decimal representation of the resulting number.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int position = input.nextInt();
        int value = input.nextInt();
        int result = 0;
        if (value == 1) {
            result = number | (1 << position);
            System.out.println(result);
        } else if (value == 0) {
            result = number & ~(1 << position);
            System.out.println(result);
        }
    }
}
