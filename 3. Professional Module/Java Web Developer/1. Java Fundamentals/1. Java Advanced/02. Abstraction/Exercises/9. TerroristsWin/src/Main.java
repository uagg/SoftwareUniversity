/*
On de_dust2 terrorists have planted a bomb (or possibly several of them)! Write a program that sets those bombs off!
A bomb is a string in the format |...|. When set off, the bomb destroys all characters inside. The bomb should also
destroy n characters to the left and right of the bomb. n is determined by the bomb power (the last digit of the
ASCII sum of the characters inside the bomb). Destroyed characters should be replaced by '.' (dot). For example,
we are given the following text:
 prepare|yo|dong
The bomb is |yo|. We get the bomb power by calculating the last digit of the sum: y (121) + o (111) = 232.
The bomb explodes and destroys itself and 2 characters to the left and 2 characters to the right. The result is:
 prepa........ng
Input
The input data should be read from the console. On the first and only input line you will receive the text.
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
The destroyed text should be printed on the console.
Constraints
•	The length of the text will be in the range [1...1000].
•	The bombs will hold a number of characters in the range [0…100].
•	Bombs will not be nested (i.e. bomb inside another bomb).
•	Bomb explosions will never overlap with other bombs.
•	Time limit: 0.3 sec. Memory limit: 16 MB. 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] result = input.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == '|') {
                int bombStart = i;
                int bombEnd = findBombEnd(result, bombStart + 1);

                String bombStr = extractBombStr(result, bombStart + 1);
                int bombRadius = calcBombRadius(bombStr);

                bombStart -= bombRadius;
                bombEnd += bombRadius;

                if (bombStart < 0) bombStart = 0;
                if (bombEnd >= result.length) bombEnd = result.length - 1;

                result = bombResult(result, bombStart, bombEnd);
            }
        }

        System.out.println(result);
    }

    static int calcBombRadius(String bomb) {
        char[] chars = bomb.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += c;
        }
        return sum % 10;
    }

    static String extractBombStr(char[] target, int start) {
        StringBuilder bombStr = new StringBuilder("");
        for (int subInd = start; subInd < target.length; subInd++) {
            if (target[subInd] == '|') break;
            bombStr.append(target[subInd]);
        }
        return bombStr.toString();
    }

    static int findBombEnd(char[] target, int start) {
        int end = target.length - 1;
        for (int i = start; i < target.length; i++) {
            if (target[i] == '|') {
                end = i;
                break;
            }
        }
        return end;
    }

    static char[] bombResult(char[] target, int start, int end) {
        for (int i = start; i < target.length && i <= end; i++) {
            target[i] = '.';
        }
        return target;
    }
}