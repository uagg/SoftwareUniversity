/*
Write a program that draws the figure below depending on n. Use recursion.
 */
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Draw(size);
    }

    private static void Draw(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(String.join("", Collections.nCopies(n,"*")));
        Draw(n - 1);
        System.out.println(String.join("", Collections.nCopies(n,"#")));
    }
}
