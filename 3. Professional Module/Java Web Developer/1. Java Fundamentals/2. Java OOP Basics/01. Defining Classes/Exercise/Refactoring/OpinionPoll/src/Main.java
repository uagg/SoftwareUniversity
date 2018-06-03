import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amountOfPeople = Integer.parseInt(reader.readLine());

        Map<String, Person> people = new TreeMap<>();

        while ((amountOfPeople > 0)) {
            String[] tokens = reader.readLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            people.put(name, person);
            amountOfPeople--;
        }

        people.values().stream().sorted(Comparator.comparing(a -> a.name)).filter(x -> x.age > 30).forEach(x ->
                System.out.printf("%s - %d%n", x.name, x.age));
    }
}
