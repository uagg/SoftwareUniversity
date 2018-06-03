/*
Read a sequence of integers, given on a single line separated by a space.
Finds all unique elements, such that 10 ≤ n ≤ 20 and print only the first 2 elements.
If there are fewer than 2 elements, print as much as there are. If there are no elements, print nothing.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));

        numbers.stream()
                .filter(e -> e >= 10 && e <= 20)
                .distinct()
                .limit(2)
                .forEach(e -> System.out.print(e + " "));
    }
}