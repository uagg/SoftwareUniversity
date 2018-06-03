/*
Read a sequence of names, given on a single line, separated by a space.
Read a sequence of letters, given on the next line, separated by a space.
Find the names that start with one of the given letters and print the first of them (ordered lexicographically).
If there is no name that conforms to the requirement, print "No match".
*/
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.asList(sc.nextLine().split("\\s+"));
        Set<Character> letters = new HashSet<>();
        Stream.of(sc.nextLine().split("\\s+"))
                .map(l -> l.toLowerCase().charAt(0))
                .forEach(c -> letters.add(c));

        Optional<String> first = names.stream()
                .filter(s -> letters.contains(s.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if (first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}