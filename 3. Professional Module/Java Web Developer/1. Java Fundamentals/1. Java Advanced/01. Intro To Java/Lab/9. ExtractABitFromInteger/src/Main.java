/*
Write a program that extracts from given positive integer n the value of given bit at index p. The bits are counted
from right to left, starting from bit 0.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int bit = input.nextInt();

        System.out.println((number >> bit) & 1);
    }
}
