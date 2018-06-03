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
            Person person = new Person(firstName, lastName, age, salary);
            persons.add(person);
        }

        int bonus = Integer.parseInt(reader.readLine());
        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }

}
