import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amountOfPeople = Integer.parseInt(reader.readLine());
        List<Person> persons = new ArrayList<>();

        while(amountOfPeople-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            Integer age = Integer.parseInt(tokens[2]);
            Double salary = Double.parseDouble(tokens[3]);
            try {
                Person person = new Person(firstName, lastName, age, salary);
                persons.add(person);
            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }
        }

        Team team = new Team("Minior");
        for (Person person : persons) {
            team.addPlayer(person);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}