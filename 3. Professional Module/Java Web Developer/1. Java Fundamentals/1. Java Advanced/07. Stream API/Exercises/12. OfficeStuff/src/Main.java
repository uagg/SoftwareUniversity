/*
You are given a sequence of n companies in format |<company> - <amount> - <product>|. Example:
● |SoftUni - 600 - paper|
● |Vivacom - 600 - pen|
● |XS - 20 - chair|
● |Vivacom - 200 - chair|
● |SoftUni - 40 - chair|
● |XS - 40 - chair|
● |SoftUni - 1 - printer|
Write a program that prints all companies in alphabetical order. For each company print the product type and their
aggregated ordered amounts. Order the products by order of appearance. Print the result in the following
format: <company>: <product>-<amount>, <product>-<amount>,… For the orders above the output should be:
● SoftUni: paper-600, chair-40, printer-1
● Vivacom: pen-600, chair-200
● XS: chair-60
Input
The input comes from the console. At the first line the number n stays alone. At the next n lines, we have n orders in
format |<company> - <amount> - <product>|.
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
Print one line for each company. Company lines should be ordered in alphabetical order. For each company print the
products ordered by this company in order of appearance, along with the total amount for the given product.
Each line should be in format <company>: <product>-<amount>, <product>-<amount>, … <product>-<amount>
Constraints
● The count of the lines n will be in the range [1 … 100].
● The <company> and <product> will consist of only of Latin characters, with length of [1 … 20].
● The <amount> will be an integer number in the range [1 … 1000].
● Time limit: 0.1 sec. Memory limit: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String, Integer>> companies = new TreeMap<>();

        int companiesCount = Integer.valueOf(bf.readLine());

        for (int i = 0; i < companiesCount; i++) {
            String[] token = bf.readLine().split("\\s+-\\s+");
            String company = token[0].substring(1);
            int itemCount = Integer.valueOf(token[1]);
            String item = token[2].substring(0, token[2].length() - 1);

            companies.putIfAbsent(company, new LinkedHashMap<>());
            companies.get(company).putIfAbsent(item, 0);
            itemCount += companies.get(company).get(item);
            companies.get(company).put(item, itemCount);
        }

        companies.entrySet()
                .forEach(c -> {
                    System.out.printf("%s: ", c.getKey());
                    StringBuilder sb = new StringBuilder();
                    c.getValue().entrySet()
                            .forEach(i -> sb.append(i.getKey()).append("-").append(i.getValue()).append(", "));
                    System.out.println(sb.delete(sb.length() - 2, sb.length() - 1).toString());
                });
    }
}