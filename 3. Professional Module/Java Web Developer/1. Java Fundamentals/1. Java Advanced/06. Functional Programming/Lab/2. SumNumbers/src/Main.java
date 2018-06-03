/*
Write a program that reads one line of Integers separated by ", ". Print the count of the numbers and their sum.
Use a Function<String, Integer>
 */
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");

        Function<String, Integer> parser = x -> Integer.parseInt(x);
        int sum = 0;

        for (String s : input) {
            sum += parser.apply(s);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);
    }
}