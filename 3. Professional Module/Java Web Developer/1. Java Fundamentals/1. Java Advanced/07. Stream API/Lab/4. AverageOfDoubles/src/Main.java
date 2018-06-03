/*
Read a sequence of double numbers, given on a single line, separated by a space.
Find the average of all elements, using the Stream API.
Round the output to the second digit after the decimal separator.
If there are no numbers in the sequence, print "No match".
 */
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.asList(sc.nextLine().split("\\s+"));

        //DoubleStream elements = numbers.stream().mapToDouble(Double::valueOf);

        OptionalDouble average = numbers.stream()
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();

        if (average.isPresent()) {
            System.out.printf("%.2f",average.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}