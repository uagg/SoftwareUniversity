/*
On the first line, read two numbers, a lower and an upper bound, separated by a space.
On the second line, read a sequence of numbers, separated by a space.
Print all numbers, such that [lower bound] ≤ n ≤ [upper bound].
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> bounds = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        List<String> tokens = Arrays.asList(sc.nextLine().split("\\s+"));

        List<Integer> filteredValues = tokens.stream().filter(s -> (s != null && !s.isEmpty())).map(Integer::valueOf)
                .filter(x -> (Collections.min(bounds) <= x && x <= Collections.max(bounds))).collect(Collectors.toList());

        if (!filteredValues.isEmpty()) {
            System.out.println(Arrays.toString(filteredValues.toArray()).replaceAll("[\\[\\],]", ""));
        }
    }
}