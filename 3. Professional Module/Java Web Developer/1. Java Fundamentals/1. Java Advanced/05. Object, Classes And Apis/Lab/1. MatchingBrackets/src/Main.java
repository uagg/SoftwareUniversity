/*
We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.
Print the each sub-expression on a new line.
 */
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String expression = input.nextLine();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                String contents = expression.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}