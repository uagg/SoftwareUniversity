/*
So many people! It’s hard to count them all. But that’s your job as a statistician. You get raw data for a given city
and you need to aggregate it.
On each input line you’ll be given data in format: "city|country|population". There will be no redundant whitespaces
anywhere in the input.  A city-country pair will not be repeated. Aggregate the data by country and by city and print
it on the console. For each country, print its total population and on separate lines the data for each of its cities.
Countries should be ordered by their total population in descending order and within each country, the cities should be
ordered by the same criterion. If two countries/cities have the same population, keep them in the order in which they
were entered. Check out the examples; follow the output format strictly!
Input
•	The input data should be read from the console.
•	It consists of a variable number of lines and ends when the command "report" is received.
•	The input data will always be valid and in the format described. There is no need to check it explicitly.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String, Integer>> countryAndCityPopulation = new LinkedHashMap<>();
        Map<String, Long> countryPopulation = new LinkedHashMap<>();

        enterCountriesAndPopulation(bf, countryAndCityPopulation, countryPopulation);

        LinkedHashMap<String, Long> orderedByCountryPopulation = countryPopulation.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<String, Long> country : orderedByCountryPopulation.entrySet()) {
            System.out.printf("%s (total population: %d)%n", country.getKey(), country.getValue());

            LinkedHashMap<String, Integer> orderedCitiesByPopulation =
                    countryAndCityPopulation.get(country.getKey())
                            .entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            for (Map.Entry<String, Integer> city : orderedCitiesByPopulation.entrySet()) {
                System.out.printf("=>%s: %d%n", city.getKey(), city.getValue());
            }
        }
    }

    private static void enterCountriesAndPopulation(BufferedReader bf,
                                                    Map<String, LinkedHashMap<String, Integer>> countryAndCityPopulation,
                                                    Map<String, Long> countryPopulation) throws IOException {
        while (true) {
            String[] line = bf.readLine().split("\\|");

            if ("report".equalsIgnoreCase(line[0])) {
                break;
            }

            String city = line[0];
            String country = line[1];
            int population = Integer.valueOf(line[2]);

            if (!countryAndCityPopulation.containsKey(country)) {
                LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();

                countryAndCityPopulation.put(country, cityPopulation);
                countryPopulation.put(country, 0L);
            }

            LinkedHashMap<String, Integer> citiesPopulation = countryAndCityPopulation.get(country);
            citiesPopulation.put(city, population);
            countryAndCityPopulation.put(country, citiesPopulation);
            long totalCountryPopulation = countryPopulation.get(country) + population;
            countryPopulation.put(country, totalCountryPopulation);
        }
    }
}