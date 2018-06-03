/*
Given a sequence consisting of parentheses, determine whether an expression is balanced. A sequence of parentheses is
balanced if every open parenthesis can be paired uniquely with a closed parenthesis that occurs after the former.
Also, the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.
{[()]} - This is a balanced parenthesis.
{[(])} - This is not a balanced parenthesis.
Input
•	Each input consists of a single line, the sequence of parentheses.
•	1 ≤ Length of sequence ≤ 1000
•	Each character of the sequence will be one of the following: {, }, (, ), [, ].
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<Character> dq = new ArrayDeque<>();

        String input = scan.nextLine();
        boolean isFound = false;

        for (int i = 0; i < input.length(); i++) {

            Character curentChar = input.charAt(i);
            if (curentChar.equals('{')) {
                dq.push(curentChar);
            } else if (curentChar.equals('[')) {
                dq.push(curentChar);
            } else if (curentChar.equals('(')) {
                dq.push(curentChar);
            } else if (curentChar.equals('}')) {
                try {
                    Character lastChar = dq.peekFirst();
                    if (!lastChar.equals('{')) {
                        isFound = true;
                        break;
                    } else {
                        dq.pop();
                    }
                }
                catch (NullPointerException e) {
                    System.out.printf("NO");
                    return;
                }
            } else if (curentChar.equals(']')) {
                try {
                    Character lastChar = dq.peekFirst();
                    if (!lastChar.equals('[')) {
                        isFound = true;
                        break;
                    } else {
                        dq.pop();
                    }
                }
                catch (NullPointerException e) {
                    System.out.printf("NO");
                    return;
                }
            } else if (curentChar.equals(')')) {
                try {
                    Character lastChar = dq.peekFirst();
                    if (!lastChar.equals('(')) {
                        isFound = true;
                        break;
                    } else {
                        dq.pop();
                    }
                } catch (NullPointerException e) {
                    System.out.printf("NO");
                    return;
                }
            }
        }

        if (input.length() == 1) {
            System.out.printf("NO");
        } else {
            if (!isFound) {
                System.out.printf("YES");
            } else {
                System.out.printf("NO");
            }
        }
    }
}