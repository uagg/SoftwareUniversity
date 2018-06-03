/*
Write a program that reads an integer N on the first line. And on next N lines read pairs of "[name], [age]".
Then read three more lines with:
•	Condition - "younger" or "older"
•	Age - Integer
•	Format - "name", "age" or "name age"
Depending on the condition, print the pairs in the right format.
Don’t use any build-in functionality. Write your own methods.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linesCount = Integer.parseInt(sc.nextLine());

        Map<String, Integer> nameAndAge = new LinkedHashMap<>();

        for (int i = 0; i < linesCount; i++) {
            String[] input = sc.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            nameAndAge.put(name, age);
        }

        String condition = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        Predicate<Integer> tester = createTester(condition, age);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudent(nameAndAge, tester, printer);

    }

    private static void printFilteredStudent(Map<String, Integer> people, Predicate<Integer> tester,
                                             Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(person.getValue())) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        switch (format) {
            case "name":
                return p -> System.out.printf("%s%n", p.getKey());
            case "age":
                return p -> System.out.printf("%d%n", p.getValue());
            case "name age":
                return p -> System.out.printf("%s - %d%n", p.getKey(), p.getValue());
            default:
                return null;
        }
    }

    private static Predicate<Integer> createTester(String condition, int age) {
        switch (condition) {
            case "younger":
                return x -> x < age;
            case "older":
                return x -> x >= age;
            default:
                return null;
        }
    }
}