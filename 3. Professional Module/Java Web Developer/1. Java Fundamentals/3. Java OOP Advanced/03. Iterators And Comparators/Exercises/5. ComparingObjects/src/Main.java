import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        String input;
        while (! "END".equals(input = reader.readLine())) {
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person p = new Person(name, age, town);
            people.add(p);
        }

        int targetInd = Integer.parseInt(reader.readLine());

        if (targetInd >= people.size()) {
            System.out.println("No matches");
            return;
        }

        Person targetPerson = people.get(targetInd);

        long equalPeople = people.stream()
                .filter(p -> p.compareTo(targetPerson) == 0)
                .count();

        if (equalPeople == 0) {
            System.out.println("No matches");
            return;
        }

        long unequalPeople = (long)people.size() - equalPeople;

        System.out.println(String.format("%s %s %s",
                equalPeople,
                unequalPeople,
                people.size()));
    }
}