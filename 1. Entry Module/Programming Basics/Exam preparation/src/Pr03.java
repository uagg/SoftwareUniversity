import java.util.Scanner;

public class Pr03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        boolean isHoliday = scanner.nextLine() .equals("Y");
        double hrizantemsPrice = 0.0d;
        double rosesPrice = 0.0d;
        double tulipsPrice = 0.0d;

        if(("Spring".equals(season)) || ("Summer".equals(season))) {
            hrizantemsPrice = 2d;
            rosesPrice = 4.1d;
            tulipsPrice = 2.5d;
        } else if(("Autumn".equals(season)) || ("Winter".equals(season))) {
            hrizantemsPrice = 3.75d;
            rosesPrice = 4.5d;
            tulipsPrice = 4.15d;
        }

        if(isHoliday) {
            hrizantemsPrice *= 1.15d;
            rosesPrice *= 1.15d;
            tulipsPrice *= 1.15d;
        }
        hrizantemsPrice *= hrizantemsCount;
        rosesPrice *= rosesCount;
        tulipsPrice *= tulipCount;

        double totalPrice = hrizantemsPrice + rosesPrice + tulipsPrice;

        if(tulipCount > 7 && "Spring".equals(season)) {
            totalPrice = totalPrice - (totalPrice * 0.05d);
        }

        if(rosesCount >= 10 && "Winter".equals(season)) {
            totalPrice = totalPrice - (totalPrice * 0.1d);
        }
        if(tulipCount + rosesCount + hrizantemsCount > 20) {
            totalPrice = totalPrice - (totalPrice * 0.2d);
        }
        System.out.printf("%.2f",(totalPrice + 2d));
    }
}

