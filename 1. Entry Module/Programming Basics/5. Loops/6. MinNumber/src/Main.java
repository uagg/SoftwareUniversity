/*
Напишете програма, която въвежда n цели числа (n > 0) и намира най-малкото измежду тях. Първо се въвежда броят числа n,
а след това самите n числа, по едно на ред.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currNumber = Integer.parseInt(scanner.nextLine());
            if(currNumber < maxNum) {
                maxNum = currNumber;
            }
        }
        System.out.println(maxNum);
    }
}