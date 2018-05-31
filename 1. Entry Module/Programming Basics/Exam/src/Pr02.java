import java.util.Scanner;

public class Pr02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int glassCount = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int workDaysCount = Integer.parseInt(scanner.nextLine());

        int daysWorkersHours = workersCount * workDaysCount * 8;
        double glassWorked = Math.floor(daysWorkersHours / 5);

        double glassPrices = Math.abs(glassWorked - glassCount);
        double price = 4.2 * glassPrices;
        if(glassCount > glassWorked) {
            System.out.printf("Losses: %.2f", price);
        } else {
            System.out.printf("%.2f extra money", price);
        }
    }
}
