/*
Implement the following sorting algorithms:
•	Bubble Sort
•	Selection Sort
Read a sequence of numbers from the console, sort them and print them back.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        int[] parsedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            parsedArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < parsedArr.length - 1; i++)
        {
            int index = i;

            for (int j = i + 1; j < parsedArr.length; j++) {
                if (parsedArr[j] < parsedArr[index]) {
                    index = j;
                }
            }
            int smallerNumber = parsedArr[index];
            parsedArr[index] = parsedArr[i];
            parsedArr[i] = smallerNumber;
        }

        for (int element : parsedArr) {
            System.out.print(element + " ");
        }
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] arr = input.nextLine().split(" ");
//        int[] parsedArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            parsedArr[i] = Integer.parseInt(arr[i]);
//        }
//
//        boolean isSwapped = true;
//
//        while (isSwapped) {
//            isSwapped = false;
//            for (int i = 0; i < parsedArr.length - 1; i++) {
//                if (parsedArr[i] > parsedArr[i + 1]) {
//                    int temp = parsedArr[i + 1];
//                    parsedArr[i + 1] = parsedArr[i];
//                    parsedArr[i] = temp;
//                    isSwapped = true;
//                }
//            }
//        }
//
//        for (int element : parsedArr) {
//            System.out.print(element + " ");
//        }
//    }
//}