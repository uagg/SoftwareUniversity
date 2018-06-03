/*
You will be given an integer N representing the number of elements to push onto a stack, an integer S representing the
number of elements to pop from the stack and finally an integer X, an element that you should check whether is present
in the stack. If it is, print true on the console. If it’s not, print the smallest element currently present in the stack.
Input
•	On the first line, you will be given N, S and X separated by a single space.
•	On the next line, you will be given a line of numbers separated by one or more white spaces.
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] condition = scanner.nextLine().split("\\s+");
        int sizeOfStack = Integer.parseInt(condition[0]);
        int poppingSize = Integer.parseInt(condition[1]);
        int checkNumber = Integer.parseInt(condition[2]);
        String[] stackFiller = scanner.nextLine().split("\\s+");

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < sizeOfStack; i++) {
            stack.push(Integer.parseInt(stackFiller[i]));
        }

        for (int i = 0; i < poppingSize; i++) {
            stack.pop();
        }

        if (stack.contains(checkNumber)) {
            System.out.println(stack.contains(checkNumber));
        } else if (!stack.contains(checkNumber) && !stack.isEmpty()) {
            System.out.println(stack.peek());
        } else if (stack.isEmpty()) {
            System.out.println("0");
        }
    }
}
