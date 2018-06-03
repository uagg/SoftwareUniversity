/*
You will be given an integer N representing the number of elements to enqueue (add), an integer S representing the
number of elements to dequeue (remove/poll) from the queue and finally an integer X, an element that you should check
whether is present in the queue. If it is print true on the console, if it’s not print the smallest element currently
present in the queue.
 */
import java.util.ArrayDeque;
import java.util.Collections;
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

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < sizeOfStack; i++) {
            queue.add(Integer.parseInt(stackFiller[i]));
        }

        for (int i = 0; i < poppingSize; i++) {
            queue.poll();
        }

        if (queue.contains(checkNumber)) {
            System.out.println(queue.contains(checkNumber));
        } else if (!queue.contains(checkNumber) && queue.size() != 0) {
            System.out.println(Collections.min(queue));
        } else if (queue.isEmpty()) {
            System.out.println("0");
        }
    }
}
