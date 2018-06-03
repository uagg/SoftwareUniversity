/*
Read a sequence of numbers, given on a single line, separated by a space.
Find the smallest number of all even numbers, using the Stream API.
If there are no numbers in the sequence, print "No match".
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbers = Arrays.asList(Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::valueOf)
                .filter(n -> n % 2 == 0)
                .boxed()
                .toArray(Double[]::new));

        Optional<Double> result = numbers.stream().min(Double::compare);

        if(result.isPresent()) {
            System.out.printf("%.2f", result.get());
        } else {
            System.out.println("No match");
        }
    }
}