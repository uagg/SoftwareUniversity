/*
Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
Pass it to an Arrays.sort() function and print the result.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        Comparator<Integer> evenBeforeOdd = (a, b) -> {
            if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else {
                return a.compareTo(b);
            }
        };

        Arrays.sort(numbers, evenBeforeOdd);

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}