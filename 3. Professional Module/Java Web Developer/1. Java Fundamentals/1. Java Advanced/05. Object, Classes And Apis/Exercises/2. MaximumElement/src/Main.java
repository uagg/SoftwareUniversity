/*
You have an empty sequence and you will be given N commands. Each command is of the following types:
•	"1 X" - Push the element X into the stack.
•	"2" - Delete the element present at the top of the stack.
•	"3" - Print the maximum element in the stack.
Input
•	The first line of input contains an integer N, where 1 ≤ N ≤ 10^5
•	The next N lines contain commands. All commands will be valid and in the format described
•	The element X will be in range 1 ≤ X ≤ 10^9
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();

        int numberOfCommands = Integer.parseInt(sc.nextLine());

        while (numberOfCommands != 0) {
            String[] input = sc.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);
            int element = 0;

            if (input.length == 2) {
                element = Integer.parseInt(input[1]);
            }

            switch (command) {
                case 1:
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    printMax(stack);
                    break;
            }

            numberOfCommands--;
        }
    }

    public static void printMax(Deque<Integer> stack) {
        int biggestElement = Integer.MIN_VALUE;

        for (Integer element : stack) {
            if (element > biggestElement) {
                biggestElement = element;
            }
        }

        System.out.println(biggestElement);
    }
}