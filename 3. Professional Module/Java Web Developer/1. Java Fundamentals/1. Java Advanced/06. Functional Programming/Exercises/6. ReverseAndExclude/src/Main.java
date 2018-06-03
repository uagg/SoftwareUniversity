/*
Write a program that reverses a collection and removes elements that are divisible by a given integer n.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputArray = new ArrayList<>(Arrays.asList(Arrays.stream(br.readLine().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .boxed()
        .toArray(Integer[]::new)));

        int divisor = Integer.parseInt(br.readLine());

        inputArray.removeIf(num -> num % divisor == 0);
        Collections.reverse(inputArray);

        inputArray.forEach(x -> System.out.print(x + " "));
    }
}
