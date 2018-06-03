import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());

        List<Box<String>> results = new ArrayList<>();

        for (int i = 0; i < tests; i++) {
            String input = reader.readLine();
            Box<String> box = new Box<>(input);
            results.add(box);
        }

        String[] indiceSwappers = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(indiceSwappers[0]);
        int secondIndex = Integer.parseInt(indiceSwappers[1]);

        swapElementsInList(results, firstIndex, secondIndex);

        for (Box<String> result : results) {
            System.out.println(result.toString());
        }
    }

    public static <E> void swapElementsInList(List<E> list, int firstIndex, int secondIndex) {
        E temp = list.get(firstIndex);

        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }
}
