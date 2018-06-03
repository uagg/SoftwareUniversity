/*
Write a program that reads a collection of names as strings from the console and then appends “Sir” in front of every
name and prints it back onto the console. Use a Consumer<T>.
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

        Consumer<String> addSirAndPrint = name -> System.out.println("Sir " + name);

        for (String name : names) {
            addSirAndPrint.accept(name);
        }
    }
}
