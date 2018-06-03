/*
You are given two lines - each can be a really big number (0 to 1050). You must display the sum of these numbers.
Note: do not use the BigInteger or BigDecimal classes for solving this problem.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder a = new StringBuilder(reader.readLine());
        StringBuilder b = new StringBuilder(reader.readLine());

        removeZeros(a);
        removeZeros(b);

        String[] numA = new StringBuilder(a).reverse().toString().split("");
        String[] numB = new StringBuilder(b).reverse().toString().split("");

        int length = numA.length >= numB.length ? numA.length : numB.length;

        StringBuilder result = new StringBuilder("");
        long remainder = 0;

        for (int i = 0; i < length; i++) {
            if (i >= numA.length) {
                long digit = Long.valueOf(numB[i]);
                long sum = digit + remainder;

                result.append(sum % 10);
                remainder = sum / 10;
            } else if (i >= numB.length) {
                long digit = Long.valueOf(numA[i]);
                long sum = digit + remainder;

                result.append(sum % 10);
                remainder = sum / 10;
            } else {
                long digitNumA = Long.valueOf(numA[i]);
                long digitNumB = Long.valueOf(numB[i]);

                long sum = digitNumA + digitNumB + remainder;

                result.append(sum % 10);
                remainder = sum / 10;
            }
        }

        while (remainder > 0) {
            result.append(remainder % 10);
            remainder /= 10;
        }

        System.out.println(result.reverse());
    }

    private static void removeZeros(StringBuilder firstNumber) {
        while (firstNumber.charAt(0) == '0') {
            firstNumber.delete(0, 1);
        }
    }
}
