/*
You are given a sequence of strings, each on a new line. Every odd line on the console is representing a resource
(e.g. Gold, Silver, Copper, and so on) and every even – quantity. Your task is to collect the resources and print them.
Print the resources and their quantities in format:  {resource} –> {quantity}
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> resources = new LinkedHashMap<>();

        enterResources(bf, resources);
        printResources(resources);
    }

    private static void printResources(Map<String, Integer> resources) {
        for (Map.Entry<String, Integer> resource : resources.entrySet()) {
            System.out.printf("%s -> %d%n", resource.getKey(), resource.getValue());
        }
    }

    private static void enterResources(BufferedReader bf, Map<String, Integer> resources) throws IOException {
        while (true) {
            String resource = bf.readLine();

            if ("stop".equalsIgnoreCase(resource)) {
                break;
            }

            int quantity = Integer.valueOf(bf.readLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, 0);
            }

            quantity += resources.get(resource);
            resources.put(resource, quantity);
        }
    }
}