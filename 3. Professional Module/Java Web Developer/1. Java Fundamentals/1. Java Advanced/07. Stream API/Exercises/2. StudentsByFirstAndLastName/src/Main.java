/*
Using the same input as above print all students whose first name is before their last name lexicographically.
Use a Stream query. Print them in order of appearance.
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> students = new LinkedHashSet<>();

        while (true) {
            String input = sc.nextLine();

            if ("END".equalsIgnoreCase(input)) {
                break;
            }

            if (input.isEmpty()) {
                continue;
            } else {
                students.add(input);
            }

            if (students.isEmpty()) {
                return;
            }
        }

        students.stream()
                .filter(s -> (s != null && !s.isEmpty()))
                .filter(s -> s.split("\\s+")[0].compareTo(s.split("\\s+")[1]) < 0).forEach(System.out::println);
    }
}