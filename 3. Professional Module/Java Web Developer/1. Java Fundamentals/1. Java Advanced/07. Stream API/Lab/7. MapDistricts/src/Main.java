/*
On the first line, you are given the population count of districts in different cities, separated by a single space in
the format "city:district population".
On the second line, you are given the minimum population for filtering of the towns. The population of a town is the
sum of populations of all of its districts.
Print all cities with population greater than a given. Sort cities and districts by descending population and print
top 5 districts for a given city.
 */
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> cities = new HashMap<>();
        List<String> tokens = Arrays.asList(scanner.nextLine().split("\\s+"));

        for (String token : tokens) {
            String[] tokenArgs = token.split(":");
            String city = tokenArgs[0];
            int districtPopulation = Integer.parseInt(tokenArgs[1]);

            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(districtPopulation);
        }

        int bound = Integer.valueOf(scanner.nextLine());

        cities.entrySet()
                .stream()
                .filter(getFilterByPopulationPredicate(bound))
                .sorted(getSortByDescendingPopulationComparator())
                .forEach(getPrintMapEntryConsumer());
    }

    public static Predicate<Map.Entry<String, List<Integer>>> getFilterByPopulationPredicate(int bound) {
        return kv -> kv.getValue().stream().mapToInt(Integer::valueOf).sum() >= bound;
    }

    public static Comparator<Map.Entry<String, List<Integer>>> getSortByDescendingPopulationComparator() {
        return (kv1, kv2) -> Integer.compare(kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                                             kv1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    public static Consumer<Map.Entry<String, List<Integer>>> getPrintMapEntryConsumer() {
        return kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue()
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .limit(5)
                    .forEach(dp -> System.out.print(dp + " "));
            System.out.println();
        };
    }
}