/*
The Wire’s parents are on a vacation for the holidays and he is planning an epic party at home. Unfortunately,
his organizational skills are next to non-existent so you are given the task to help him with the reservations.
On the first line you get a list with all the people that are coming. On the next lines, until you get the "Party!"
command, you may be asked to double or remove all the people that apply to given criteria. There are three different
options:
•	Everyone that has a name starting with a given string;
•	Everyone that has a name ending with a given string;
•	Everyone that has a name with a given length.
If nobody is going, print "Nobody is going to the party!"
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> people = new ArrayList<>(Arrays.asList(Arrays.stream(br.readLine().split("\\s+"))
                .toArray(String[]::new)));

        String command = br.readLine();

        while(!"Party!".equals(command)) {
            String[] commandParameters = command.split("\\s+");
            Predicate<String> conditionalAction = createConditionalAction(commandParameters[1], commandParameters[2]);
            executeCommand(people, commandParameters[0], conditionalAction);

            command = br.readLine();
        }

        if (people.size() > 0) {
            System.out.println(String.join(", ", people) + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }

    private static void executeCommand(List<String> names, String command, Predicate<String> conditionalAction) {
        switch (command) {
            case "Double":
                for (int i = 0; i < names.size() ; i++) {
                    if (conditionalAction.test(names.get(i))) {
                        names.add(i, names.get(i));
                        i++;
                    }
                }
                break;
            case "Remove":
                names.removeIf(conditionalAction);
                break;
        }
    }

    private static Predicate<String> createConditionalAction(String command, String value) {
        switch (command) {
            case "StartsWith":
                return string -> string.startsWith(value);
            case "EndsWith":
                return string -> string.endsWith(value);
            case "Length":
                return string -> string.length() == Integer.parseInt(value);
            default:
                return string -> string.length() > 0;
        }
    }
}