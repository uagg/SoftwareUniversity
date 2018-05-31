/*
Да се напише програма, която превръща число [0…100] в текст: 25  “twenty five”. Ако числото не е в диапазона,
принтирайте „invalid number”.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        String[] teens = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        int digit2 = number % 10;
        int digit1 = (number - digit2) / 10;

        if (number >= 0 && number <= 100)
        {
            if (number == 100)
            {
                System.out.println("one hundred");
            }
            else if (number <= 10)
            {
                System.out.println(ones[number]);
            }
            else if (number < 20)
            {
                System.out.println(teens[(number % 10) - 1]);
            }
            else if (number % 10 == 0)
            {
                System.out.println(tens[number / 10 - 2]);
            }
            else if (number > 20)
            {
                System.out.println(tens[digit1 - 2] + " " + ones[digit2]);
            }
        }
        else
        {
            System.out.println("invalid number");
        }
    }
}
