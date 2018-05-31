/*
Напишете програма, която чете n числа и пресмята сумата, минимума и максимума на числата на четни и нечетни позиции
(броим от 1). Когато няма минимален / максимален елемент, отпечатайте “No”.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = - Double.MAX_VALUE;
        double evenSum = 0.0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = - Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double numbers = Double.parseDouble(scanner.nextLine());
            if((numbers != Double.MAX_VALUE) && (numbers != Double.MIN_VALUE)) {
                if(i % 2 != 0) {
                    oddSum += numbers;
                    if(numbers < oddMin) {
                        oddMin = numbers;
                    }
                    if(numbers > oddMax) {
                        oddMax = numbers;
                    }
                } else {
                    evenSum += numbers;
                    if(numbers < evenMin) {
                        evenMin = numbers;
                    }
                    if(numbers > evenMax) {
                        evenMax = numbers;
                    }
                }
            }
        }
        if(n == 0) {
            System.out.printf("OddSum = 0\n");
            System.out.printf("OddMin = no\n");
            System.out.printf("OddMax = no\n");
            System.out.printf("evenSum = 0\n");
            System.out.printf("evenMin = No\n");
            System.out.printf("evenMax = No\n");
        } else if(n == 1) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("OddSum = %s\n", df.format(oddSum));
            System.out.printf("OddMin = %s\n", df.format(oddMin));
            System.out.printf("OddMax = %s\n", df.format(oddMax));
            System.out.printf("evenSum = 0\n");
            System.out.printf("evenMin = No\n");
            System.out.printf("evenMax = No\n");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("OddSum = %s\n", df.format(oddSum));
            System.out.printf("OddMin = %s\n", df.format(oddMin));
            System.out.printf("OddMax = %s\n", df.format(oddMax));
            System.out.printf("evenSum = %s\n", df.format(evenSum));
            System.out.printf("evenMin = %s\n", df.format(evenMin));
            System.out.printf("evenMax = %s\n", df.format(evenMax));
        }
    }
}