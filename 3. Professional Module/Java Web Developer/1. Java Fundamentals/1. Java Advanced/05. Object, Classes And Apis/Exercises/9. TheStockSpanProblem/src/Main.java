/*
The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to
calculate the span of stock’s price for all n days. Span is defined as the number of consecutive days before the given
day where the price of stock was less than or equal to price at the given day.
You can read about it here: http://www.geeksforgeeks.org/the-stock-span-problem/
Implement an efficient algorithm that calculates the spans for a given n stock prices.
Input
•	On the first line, you will receive n, the number of stock prices.
•	On the next n lines, you will get all prices.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(bf.readLine());
        int[] prices = new int[count];
        int[] spans = new int[count];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.valueOf(bf.readLine());
        }

        stack.push(0);
        spans[0] = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(spans[0]).append("\n");

        for (int i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                spans[i] = i + 1;
            } else {
                spans[i] = i - stack.peek();
            }
            sb.append(spans[i]).append("\n");
            stack.push(i);
        }

        System.out.print(sb.toString());
    }
}