/*
Hot potato is a game in which children in a circle start passing a hot potato. The counting starts with the fist kid.
Every nth time the child left with the potato leaves the game. When a kid leaves the game, it passes the potato forward.
This continues repeating until there is only one kid left.
Create a program that simulates the game of Hot Potato.  Print every kid that is removed from the circle. In the end,
print the kid that is left last.
On the first line you will get the children names and on the second – the integer n.
 */
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] children = input.nextLine().split(" ");
        int count = Integer.parseInt(input.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String kid : children) {
            queue.add(kid);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
