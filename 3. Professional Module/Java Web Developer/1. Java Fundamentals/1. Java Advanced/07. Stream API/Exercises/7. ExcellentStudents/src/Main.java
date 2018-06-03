/*
Print all students that have at least one mark Excellent (6). Use a Stream.
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Integer>> students = new LinkedHashMap<>();

        while (true) {
            String input = sc.nextLine();

            if ("END".equalsIgnoreCase(input)) {
                break;
            }

            List<String> tokens = Arrays.stream(input.split("\\s+"))
                    .filter(s -> (s != null && !s.isEmpty()))
                    .collect(Collectors.toList());

            if (tokens.isEmpty()) {
                return;
            }

            String name = tokens.get(0) + " " + tokens.get(1);

            List<Integer> grades = tokens.subList(2, tokens.size())
                    .stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            students.put(name, grades);
        }

        students
                .entrySet()
                .stream()
                .filter(s -> s.getValue().stream().anyMatch(m -> m == 6)).forEach(s -> System.out.println(s.getKey()));
    }
}