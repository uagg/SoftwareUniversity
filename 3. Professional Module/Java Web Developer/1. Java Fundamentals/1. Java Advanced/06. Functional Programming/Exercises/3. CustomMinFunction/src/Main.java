/*
Write a simple program that reads a set of numbers from the console and finds the smallest of the numbers using a simple
Function<Integer[], Integer> .
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] input = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        Function<Integer[], Integer> min = integers -> Stream.of(integers)
                .min(Comparator.comparing(i -> i)).get();

        System.out.println(min.apply(input));
    }
}