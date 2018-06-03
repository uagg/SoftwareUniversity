/*
Print all students from group number 2. Use a Stream query. Order the students by First Name.
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> students = new HashMap<>();

        String input = sc.nextLine();

        while (!"END".equalsIgnoreCase(input)) {
            if (!input.isEmpty()) {
                List<String> tokens = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

                String name = tokens.get(0) + " " + tokens.get(1);
                Integer group = Integer.valueOf(tokens.get(2));
                students.put(name, group);
            } else {
                return;
            }

            input = sc.nextLine();
        }

        students.entrySet().stream().filter(g -> (g.getValue() == 2))
                .sorted(Comparator.comparing(n -> n.getKey().substring(0, n.getKey().indexOf(" "))))
        .forEach(s -> System.out.println(s.getKey()));
    }
}