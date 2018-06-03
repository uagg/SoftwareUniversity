/*
Using the lambda expressions with Stream query syntax sort the students first by last name in ascending order and then
by first name in descending order.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();

            if ("END".equalsIgnoreCase(input)) {
                break;
            }

            if (input == null || input.isEmpty()) {
                continue;
            }

            students.add(input);
        }

        students.stream().sorted((s1, s2) -> {
            if (s1.split("\\s+")[1].compareTo(s2.split("\\s+")[1]) == 0) {
                return s2.split("\\s+")[0].compareTo(s1.split("\\s+")[0]);
            } else {
                return s1.split("\\s+")[0].compareTo(s2.split("\\s+")[0]);
            }
        }).forEach(System.out::println);
    }
}