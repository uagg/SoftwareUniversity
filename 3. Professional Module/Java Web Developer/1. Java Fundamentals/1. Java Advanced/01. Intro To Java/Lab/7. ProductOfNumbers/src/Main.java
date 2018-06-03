/*
Write a program that calculates the product of all numbers in the interval [n..m] by given n and m.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = Integer.valueOf(input.next());
        int number2 = Integer.valueOf(input.next());
        int midNumber = number1;
        BigInteger result = BigInteger.ONE;

        do {
            BigInteger toBig = new BigInteger("" + midNumber);
            result = result.multiply(toBig);
            midNumber++;
        } while (midNumber <= number2);

        System.out.printf("product[%d..%d] = %d\n", number1, number2, result);
    }
}
