/*
Фигура се състои от 6 блокчета с размер h * h, разположени като на фигурата вдясно. Долният ляв ъгъл на сградата е на
позиция {0, 0}. Горният десен ъгъл на фигурата е на позиция {2*h, 4*h}. На фигурата координатите са дадени при h = 2.
Напишете програма, която въвежда цяло число h и координатите на дадена точка {x, y} (цели числа) и отпечатва дали
точката е вътре във фигурата (inside), вън от фигурата (outside) или на някоя от стените на фигурата (border).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if((x >= 0 && x <= 3 * h && y >= 0 && y <= h) || (x >= h && x <= h * 2 && y >= h && y <= h * 4)) {
            if((x > 0 && x < h * 3 && y > 0 && y < h) || (x > h && x < h * 2 && y > h && y < h * 4)) {
                System.out.println("inside");
            } else {
                if(x > h && x < h * 2 && y == h) {
                    System.out.println("inside");
                } else {
                    System.out.println("border");
                }
            }
        } else {
            System.out.println("outside");
        }
    }
}