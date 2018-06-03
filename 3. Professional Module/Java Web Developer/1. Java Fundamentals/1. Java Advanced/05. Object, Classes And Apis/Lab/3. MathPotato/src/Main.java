/*
Rework the previous problem so that a child is removed only on a prime cycle (cycles start from 1)
If a cycle is not prime, just print the child's name.
As before, print the name of the child that is left last.
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

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
