/*
You need to calculate the price of a given quantity of "wurst" in Deutsche Marks. Read the quantity as a double value
and print the price in marks, given the following:
•	The price of 1 kg wurst is 1.20 BGN
•	The exchange rate is 4210500000000 DM : 1 BGN
Print the price, rounded to the second digit after the decimal separator.
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quantity = input.nextDouble();
        BigDecimal marks = new BigDecimal("4210500000000");
        BigDecimal priceInLevs = new BigDecimal(1.20 * quantity);
        BigDecimal result = marks.multiply(priceInLevs);
        System.out.printf("%.2f marks", result);
    }
}
