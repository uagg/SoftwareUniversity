/*
Extract and print the Marks of the students that enrolled in 2014 or 2015 (the students from 2014 have 14 as their 5-th
and 6-th digit in the FacultyNumber, those from 2015 have 15).
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Integer>> students = new LinkedHashMap<>();

        while (true) {
            String line = bf.readLine();
            if ("END".equalsIgnoreCase(line)) {
                break;
            }

            List<String> tokens = Arrays.stream(line.split("\\s+"))
                    .filter(s -> (s != null && !s.isEmpty())).collect(Collectors.toList());
            if (tokens.isEmpty()) {
                return;
            }

            String facultyNumber = tokens.get(0);
            List<Integer> grades = tokens.subList(1, tokens.size()).stream()
                    .map(Integer::valueOf).collect(Collectors.toList());
            students.put(facultyNumber, grades);
        }

        students.entrySet().stream()
                .filter(s -> (s.getKey().endsWith("14") || s.getKey().endsWith("15")))
                .forEach(s -> System.out.println(Arrays.toString(s.getValue().toArray())
                        .replaceAll("[\\[\\],]", "")));
    }
}