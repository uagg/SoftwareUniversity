/*
Read a sequence of elements, given on a single line, separated by a space.
Filter all elements that are integers and calculate their sum, using the Stream API.
If there are no numbers in the sequence, print "No match".
 */
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Optional<Integer> input = Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(Main::isNumber)
                .map(Integer::valueOf)
                .reduce((x1, x2) -> x1 + x2);

        if (input.isPresent()) {
            System.out.println(input.get());
        } else {
            System.out.println("No match");
        }
    }

    public static boolean isNumber(String something) {
        if(something.matches("[-+]?\\d*\\.?\\d+")) {
            return true;
        } else {
            return false;
        }
    }
}
