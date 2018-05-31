/*
Напишете програма, която проверява дали точка {x, y} се намира вътре в правоъгълник {x1, y1} – {x2, y2}.
Входните данни се четат от конзолата и се състоят от 6 реда: десетичните числа x1, y1, x2, y2, x и y
(като се гарантира, че x1 < x2 и y1 < y2). Една точка е вътрешна за даден правоъгълник, ако се намира някъде във
вътрешността му или върху някоя от страните му. Отпечатайте „Inside“ или „Outside“.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double dotX = Double.parseDouble(scanner.nextLine());
        double dotY = Double.parseDouble(scanner.nextLine());
        if((x1 < x2) && (y1 < y2)) {
            if((dotX >= x1) && (dotX <= x2) && (dotY >= y1) && (dotY <= y2)) {
                System.out.println("Inside");
            } else {
                System.out.println("Outside");
            }
        }
    }
}