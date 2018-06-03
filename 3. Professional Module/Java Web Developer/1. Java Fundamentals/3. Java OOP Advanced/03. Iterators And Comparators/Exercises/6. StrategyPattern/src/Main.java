import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> nameOrder = new TreeSet<>(new PersonNameComparator());
        Set<Person> ageOrder = new TreeSet<>(new PersonAgeComparator());

        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            nameOrder.add(person);
            ageOrder.add(person);
        }

        final StringBuilder output = new StringBuilder();

        nameOrder.forEach(p -> output.append(p.toString()).append(System.lineSeparator()));
        ageOrder.forEach(p -> output.append(p.toString()).append(System.lineSeparator()));

        System.out.println(output.toString().trim());
    }
}