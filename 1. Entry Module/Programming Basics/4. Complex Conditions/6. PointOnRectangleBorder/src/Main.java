/*
Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник
{x1, y1} – {x2, y2}. Входните данни се четат от конзолата и се състоят от 6 реда: десетичните числа x1, y1, x2, y2,
x и y (като се гарантира, че x1 < x2 и y1 < y2). Да се отпечата „Border“ (точката лежи на някоя от страните) или
„Inside / Outside“ (в противен случай).
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
            if(
                    (
                            (dotX == x1 || dotX == x2) &&
                                    (dotY >= y1) && (dotY <= y2)
                    )
                            ||
                            (
                                    (dotY == y1 || dotY == y2) &&
                                            (dotX >= x1) && (dotX <= x2)
                            )
                    ) {
                System.out.println("border");
            } else if((dotX > x1) && (dotX < x2) && (dotY > y1) && (dotY < y2)) {
                System.out.println("Inside / Outside");
            } else {
                System.out.println("Inside / Outside");
            }
        }
    }
}