/*
The Binary Search algorithm also can be implemented using recursion. Knowing how recursion works try implementing
it on your own.
Read a sequence of sorted numbers on the first line and a single number on the second from the console.
Find the index of the number in the given array. Return -1 if the element is not present in the array.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArr = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        boolean found = true;

        for (int i = 0; i < inputArr.length; i++) {
            if (Integer.parseInt(inputArr[i]) == n) {
                System.out.println(i);
                found = false;
                break;
            }
        }

        if (found) {
            System.out.println(-1);
        }
    }
}
