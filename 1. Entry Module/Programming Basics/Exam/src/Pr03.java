import java.util.Scanner;

public class Pr03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0d;
        String type = null;
        String city = null;
        if(budget <= 1000) {
            type = "Camp";
            if("Summer".equals(season)) {
                city = "Alaska";
                price = budget * 0.65;
            } else if("Winter".equals(season)) {
                city = "Morocco";
                price = budget * 0.45;
            }
        } else if((budget > 1000) && (budget <= 3000)) {
            type = "Hut";
            if("Summer".equals(season)) {
                city = "Alaska";
                price = budget * 0.80;
            } else if("Winter".equals(season)) {
                city = "Morocco";
                price = budget * 0.60;
            }
        } else if(budget > 3000) {
            type = "Hotel";
            if("Summer".equals(season)) {
                city = "Alaska";
                price = budget * 0.90;
            } else if("Winter".equals(season)) {
                city = "Morocco";
                price = budget * 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f", city, type, price);
    }
}
