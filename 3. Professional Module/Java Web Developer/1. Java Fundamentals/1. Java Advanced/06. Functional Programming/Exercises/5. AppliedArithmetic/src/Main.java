/*
On the first line you are given a list of numbers. On the next lines you are passed different commands that you need to
apply to all numbers in the list: "add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" ->
prints all numbers on a new line. The input will end with an "end" command, after which you need to print the result.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        Function<Integer, Integer> addOne = num -> num + 1;
        Function<Integer, Integer> subtractOne = num -> num - 1;
        Function<Integer, Integer> multiplyByTwo = num -> num * 2;

        while (true) {
            String command = bf.readLine();
            if ("end".equalsIgnoreCase(command)) {
                break;
            }

            switch (command) {
                case "add":
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = addOne.apply(nums[i]);
                    }
                    break;
                case "multiply":
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = multiplyByTwo.apply(nums[i]);
                    }
                    break;
                case "subtract":
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = subtractOne.apply(nums[i]);
                    }
                    break;
                case "print":
                    System.out.println(Arrays.toString(nums).replaceAll("[\\[\\],]", ""));
            }
        }
    }
}