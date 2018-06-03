/*
Read a sequence of strings, given on a single line separated with a space.
Map each to upper case and print them, using the Stream API.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> strings = Arrays.asList(sc.nextLine().split("\\s+"));

        strings.stream()
                .map(String::toUpperCase)
                .forEach(e -> System.out.print(e + " "));
    }
}
