/*
You are given a lower and an upper bound for a range of integer numbers. Then a command specifies if you need to list
all even or odd numbers in the given range. Use predicates that need to be passed to a method.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] bounds = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        int lowerBound = Math.min(bounds[0], bounds[1]);
        int upperBound = Math.max(bounds[0], bounds[1]);

        String oddOrEven = reader.readLine();

        Predicate<Integer> filter = evenOrOdd(oddOrEven);
        Consumer<Integer> printer = integer -> System.out.print(integer + " ");

        rangeOnCondition(lowerBound, upperBound, filter, printer);
    }

    private static void rangeOnCondition(int lowerBound, int upperBound, Predicate<Integer> filter, Consumer<Integer> printer) {
        for (int i = lowerBound; i <= upperBound ; i++) {
            if (filter.test(i)) {
                printer.accept(i);
            }
        }
    }

    private static Predicate<Integer> evenOrOdd(String condition) {
        switch (condition) {
            case "odd":
                return x -> x % 2 != 0;
            case "even":
                return x -> x % 2 == 0;
        }
        return x -> x != 0;
    }
}
