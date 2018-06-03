/*
Write a Stream query that finds the first name and last name of all students with age between 18 and 24. The query
should return the first name, last name and age. Print them in order of appearance.
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> students = new LinkedHashMap<>();

        while (true) {
            String input = sc.nextLine();

            if ("END".equalsIgnoreCase(input)) {
                break;
            }

            List<String> tokens = Arrays.stream(input.split("\\s+"))
                    .filter(s -> (s != null & !s.isEmpty()))
                    .collect(Collectors.toList());

            if (tokens.isEmpty()) {
                return;
            }

            String name = tokens.get(0) + " " + tokens.get(1);
            Integer age = Integer.valueOf(tokens.get(2));

            students.put(name, age);
        }

        students.entrySet()
                .stream()
                .filter(s -> (18 <= s.getValue() && s.getValue() <= 24))
                .forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }
}