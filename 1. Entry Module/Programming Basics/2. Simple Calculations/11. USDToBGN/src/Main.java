/*
Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN). Закръглете резултата до 2 цифри
след десетичната запетая. Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner moneyScan = new Scanner(System.in);
        double dollar = Double.parseDouble(moneyScan.nextLine());
        double leva = dollar * 1.79549;
        System.out.printf("%.2f", leva);
    }
}