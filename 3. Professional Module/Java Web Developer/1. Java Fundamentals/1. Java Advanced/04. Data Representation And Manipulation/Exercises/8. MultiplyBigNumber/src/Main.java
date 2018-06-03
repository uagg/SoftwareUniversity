/*
You are given two lines - the first one can be a really big number (0 to 1050). The second one will be a single digit
number (0 to 9). You must display the product of these numbers.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        BigInteger result = new BigInteger(first).multiply(new BigInteger(second));
        System.out.println(result);
    }
}