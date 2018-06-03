/*
Write a program that reads one line of Double prices separated by ", ". Print the prices with added VATs for all of them.
Format them to the 2nd digit after the decimal point. The order of the prices must remain the same.
Use an UnaryOperator<Double>
 */
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(", ");
        double[] array = new double[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Double.parseDouble(input[i]);
        }

        Function<Double, Double> addVat = x -> x * 1.2;

        System.out.println("Prices with VAT:");
        for (Double number : array) {
            System.out.println(String.format("%1$.2f", addVat.apply(number)).replace(".", ","));
        }
    }
}
