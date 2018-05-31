/*
Следващата задача от тази тема е да се напише конзолна програма, която въвежда оценка (десетично число)
 и отпечатва “Excellent!”, ако оценката е 5.50 или по-висока, или “Not excellent.” в противен случай.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        if(grade >= 5.5) {
            System.out.printf("Excellent!");
        } else {
            System.out.printf("Not excellent.");
        }
    }
}
