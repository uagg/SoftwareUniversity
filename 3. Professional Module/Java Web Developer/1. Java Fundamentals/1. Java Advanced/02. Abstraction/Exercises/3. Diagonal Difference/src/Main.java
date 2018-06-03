/*
Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> primaryDiagonalValues = new ArrayList<Integer>();
        List<Integer> secondaryDiagonalValues = new ArrayList<Integer>();
        int reverseCounter = n - 1;

        for (int i = 0; i < n; i++) {
            Scanner input2 = new Scanner(System.in);
            String[] entry = input2.nextLine().split(" ");

            for (int j = 0; j < entry.length; j++) {
                if (j == i) {
                    primaryDiagonalValues.add(Integer.parseInt(entry[j]));
                }
            }

            for (int j = entry.length - 1; j >= 0; j--) {
                if (reverseCounter == j) {
                    secondaryDiagonalValues.add(Integer.parseInt(entry[j]));
                }
            }

            reverseCounter--;
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int entry : primaryDiagonalValues) {
            primaryDiagonalSum += entry;
        }

        for (int entry : secondaryDiagonalValues) {
            secondaryDiagonalSum += entry;
        }

        int diff = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        System.out.println(diff);
    }
}
