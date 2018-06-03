/*
Write a program which is using  a custom function (written by you :)) to find the smallest integer in a sequence of
integers. The input could have more than one space. Your task is to collect the integers from the console,
find the smallest one and print its index (if more than one such elements exist, print the index of the rightmost one).
Hints
•	Use a Function<List<Integer>, Integer> or something similar.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(Arrays
                .stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new)));

        Function<List<Integer>, Integer> findMin = integers -> {
            Integer minIndex = -1;
            Integer minNumber = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= minNumber) {
                    minNumber = numbers.get(i);
                    minIndex = i;
                }
            }
            return minIndex;
        };

        System.out.println(findMin.apply(numbers));
    }
}