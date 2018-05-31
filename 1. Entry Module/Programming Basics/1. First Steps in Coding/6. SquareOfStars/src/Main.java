/*
Напишете Java конзолна програма, която прочита от конзолата цяло положително число N и отпечатва на конзолата квадрат
 от N звездички, като в примерите по-долу:
 3
***
* *
***
4
****
*  *
*  *
****
5
*****
*   *
*   *
*   *
*****
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
