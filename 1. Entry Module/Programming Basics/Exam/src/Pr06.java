import java.util.Scanner;

public class Pr06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int combination = 0;
        boolean isTaken = false;
        for (int i = intervalStart; i >= intervalEnd; i--) {
            for (int j = intervalStart; j >= intervalEnd; j--) {
                sum = i + j;
                combination++;
                if(!isTaken) {
                    if(sum == magicNumber) {
                        isTaken = true;
                        System.out.printf("Combination N:%d (%d + %d = %d)\n", combination, i, j, sum);
                    } else {
                        if(i == intervalEnd && j == intervalEnd) {
                            System.out.printf("%d combinations - neither equals %d\n", combination, magicNumber);
                        }
                    }
                }
            }
        }
    }
}