/*
Print all students with phones in Sofia (starting with 02 / +3592). Use a Stream.
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> students = new LinkedHashMap<>();

        while (true) {
            String line = sc.nextLine();
            if ("END".equalsIgnoreCase(line)) {
                break;
            }

            List<String> tokens = Arrays.stream(line.split("\\s+"))
                    .filter(s -> (s != null && !s.isEmpty())).collect(Collectors.toList());
            if (tokens.isEmpty()) {
                return;
            }

            String studentName = tokens.get(0) + " " + tokens.get(1);
            String phoneNumber = tokens.get(2);
            students.put(studentName, phoneNumber);
        }

        students.entrySet().stream()
                .filter(s -> (s.getValue().startsWith("02") || s.getValue().startsWith("+3592")))
                .forEach(s -> System.out.println(s.getKey()));
    }
}