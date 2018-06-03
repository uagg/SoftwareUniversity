/*
Create a program that takes two strings as arguments and returns the sum of their character codes multiplied in pairs.
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum, then continue with the next two characters).
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(" ");
        char[] firstString = strings[0].toCharArray();
        char[] secondString = strings[1].toCharArray();

        int biggerLengthOfArrays = Math.max(firstString.length, secondString.length);
        int smallestLengthOfArrays = Math.min(firstString.length, secondString.length);
        int result = 0;

        for (int i = 0; i < biggerLengthOfArrays; i++) {
            if (i < firstString.length && i < secondString.length) {
                result += firstString[i] * secondString[i];
            } else {
                if (firstString.length == smallestLengthOfArrays) {
                    result += secondString[i];
                } else if (secondString.length == smallestLengthOfArrays) {
                    result += firstString[i];
                }
            }
        }

        System.out.println(result);
    }
}
