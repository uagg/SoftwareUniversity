/*
Implement the following searching algorithms:
•	Linear Search
•	Binary Search
Read a sequence of sorted numbers on the first line and a single number on the second from the console.
Find the index of the number in the given array. Return -1 if the element is not present in the array.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().split(" ");
        int key = input.nextInt();
        int[] parsedArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            parsedArray[i] = Integer.parseInt(inputArray[i]);
        }
        int high = parsedArray.length - 1;
        int low = 0;

        int searchingFor = -1;

        while (high >= low) {
            int middle = (high + low) / 2;

            if (parsedArray[middle] > key) {
                high = middle - 1;
            } else if (parsedArray[middle] < key) {
                low = middle + 1;
            } else if (parsedArray[middle] == key) {
                searchingFor = middle;
                low = high + 1;
            }
        }

        System.out.println(searchingFor);
    }
}
