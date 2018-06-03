/*
Write a program that converts a string to a sequence of Unicode character literals.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int asciiCode = (int)ch;

            result.append(String.format("\\u%04x", asciiCode));
        }

        System.out.println(result);
    }
}
