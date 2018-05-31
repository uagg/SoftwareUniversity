/*
Да се напише програма, която въвежда текст (стринг) и изчислява и отпечатва сумата от стойностите на гласните букви
според таблицата по-долу:
буква	a	e	i	o	u
стойност	1	2	3	4	5
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}