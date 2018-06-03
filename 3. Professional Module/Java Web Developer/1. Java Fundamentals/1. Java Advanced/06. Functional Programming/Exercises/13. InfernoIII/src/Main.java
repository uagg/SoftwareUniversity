/*
Your game studio’s next triple A big-budget-killer-app is the Hack and Slash Action RPG Inferno III. The main purpose
of the game is well, to hack and slash things. But the secondary purpose is to craft items and recently the main fan
base has started complaining that once you craft an item you can’t change it. So your next job is to implement a feature
for one time reforging an item.
On the first line you are given the gems already inserted in the form of numbers, representing their power.
On the next lines, until you receive the "Forge" command, you can receive commands in the following format
{command;filter type;filter parameter}:
Commands can be: "Exclude", "Reverse" or "Forge". The possible filter types are: "Sum Left", "Sum Right" and
"Sum Left Right". All filter parameters will be an integer.
"Exclude" marks a gem for exclusion from the set if it meets a given condition. "Reverse" deletes a previous exclusion.
"Sum Left" tests if a gems power summed with the gem standing to its right gives a certain value. "Sum Right" is the
same but looks to a gems right peer. "Sum Left Right" sums the gems power with both its left and right neighbours.
Note that changes on to the item are made only after forging. This means that the gems are fixed at their positions and
every function occurs on the original set, so every gems power is considered, no matter if it is marked or not.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] gems = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<String, Predicate<Integer>> changes = new HashMap<>();

        while (true) {
            String command = reader.readLine();
            if ("Forge".equalsIgnoreCase(command)) {
                break;
            }

            String[] params = command.split(";");
            Predicate<Integer> change = createPredicate(params[1], params[2], gems);
            switch (params[0]) {
                case "Exclude":
                    changes.put(params[1] + params[2], change);
                    break;
                case "Reverse":
                    changes.remove(params[1] + params[2]);
                    break;
            }
        }

        for (int i = 0; i < gems.length; i++) {
            boolean toRemove = false;
            for (Map.Entry<String, Predicate<Integer>> change : changes.entrySet()) {
                if (change.getValue().test(i)) {
                    toRemove = true;
                    break;
                }
            }

            if (!toRemove) {
                System.out.print(gems[i] + " ");
            }
        }
    }

    private static Predicate<Integer> createPredicate(String condition, String value, int[] gems) {
        Integer number = Integer.parseInt(value);
        switch (condition) {
            case "Sum Left":
                return index -> (index > 0 ? gems[index - 1] : 0) + gems[index] == number;
            case "Sum Right":
                return index -> gems[index] + (index < gems.length - 1 ? gems[index + 1] : 0) == number;
            case "Sum Left Right":
                return index -> (index > 0 ? gems[index - 1] : 0) + gems[index] +
                        (index < gems.length - 1 ? gems[index + 1] : 0) == number;
        }
        return x -> Objects.equals(x, x);
    }
}