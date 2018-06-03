/*
Write a predicate. Its goal is to check a name for its length and to return true if the names length is less or equal
the passed integer. You will be given a string array with some names. Print the names, passing the condition in the
predicate.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String[] names = Arrays.stream(br.readLine().split("\\s+")).toArray(String[]::new);

        Predicate<String> checkLength = name -> name.length() <= number;

        Consumer<String> printer = System.out::println;

        for (String name : names) {
            if (checkLength.test(name)) {
                printer.accept(name);
            }
        }
    }
}