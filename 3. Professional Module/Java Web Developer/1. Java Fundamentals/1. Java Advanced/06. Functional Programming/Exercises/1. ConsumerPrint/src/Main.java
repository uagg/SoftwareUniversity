/*
Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then
prints them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = Arrays.stream(reader.readLine().split("\\s+")).toArray(String[]::new);

        Consumer<String> print = System.out::println;

        for (String name : names) {
            print.accept(name);
        }
    }
}
