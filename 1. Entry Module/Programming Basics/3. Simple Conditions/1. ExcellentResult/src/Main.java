/*
Първата задача от тази тема е да се напише конзолна програма, която въвежда оценка (десетично число)
 и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if(grade <= 6 && grade >= 5.5) {
            System.out.printf("Excellent!");
        } else if(grade <= 5.49 && grade >= 4.5) {
            System.out.printf("Very Good!");
        } else if(grade <= 4.49 && grade >= 3.5) {
            System.out.printf("Good!");
        } else if(grade <= 3.49 && grade >= 3) {
            System.out.printf("Middle!");
        } else {
            System.out.printf("Weak!");
        }
    }
}
