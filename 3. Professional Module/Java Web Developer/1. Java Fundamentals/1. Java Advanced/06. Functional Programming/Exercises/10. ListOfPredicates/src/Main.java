/*
Find all numbers in the range 1..N that are divisible by the numbers of a given sequence. Use predicates.
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

        int number = Integer.parseInt(br.readLine());
        List<Predicate<Integer>> predicates = new ArrayList<>();
        int[] sequence = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int num : sequence) {
            Predicate<Integer> predicate = x -> x % num == 0;
            predicates.add(predicate);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            boolean divisible = false;

            for (Predicate<Integer> predicate : predicates) {
                if (predicate.test(i)) {
                    divisible = true;
                } else {
                    divisible = false;
                    break;
                }
            }

            if (divisible) {
                result.add(i);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}