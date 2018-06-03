/*
Write a program that reads one line of Integers separated by ", ".
•	Print the even numbers
•	Sort them in ascending order
•	Print them again.
Use 2 Lambda Expresions to do so.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(", ");
        List<Integer> parsedArray = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            parsedArray.add(Integer.parseInt(inputArray[i]));
        }

        parsedArray.removeIf(n -> n % 2 != 0);

        for (int i = 0; i < parsedArray.size(); i++) {
            if (i < parsedArray.size() - 1) {
                System.out.print(parsedArray.get(i) + ", ");
            } else {
                System.out.println(parsedArray.get(i));
            }
        }

        parsedArray.sort(Integer::compareTo);

        for (int i = 0; i < parsedArray.size(); i++) {
            if (i < parsedArray.size() - 1) {
                System.out.print(parsedArray.get(i) + ", ");
            } else {
                System.out.println(parsedArray.get(i));
            }
        }
    }
}

// Old code!

//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] nums = sc.nextLine().split(", ");
//        List<Integer> input = new ArrayList<Integer>();
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//        for (int i = 0; i < nums.length; i++) {
//            input.add(Integer.parseInt(nums[i]));
//        }
//
//        numbers.addAll(input);
//        numbers.removeIf(n -> n % 2 != 0);
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            System.out.print(numbers.get(i) + ", ");
//        }
//        System.out.println(numbers.get(numbers.size() - 1));
//        numbers.sort((n, m) -> n.compareTo(m));
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            System.out.print(numbers.get(i) + ", ");
//        }
//        System.out.println(numbers.get(numbers.size() - 1));
//    }
//}
